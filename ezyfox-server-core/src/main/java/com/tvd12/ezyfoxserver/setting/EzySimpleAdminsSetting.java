package com.tvd12.ezyfoxserver.setting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "administrators")
public class EzySimpleAdminsSetting implements EzyAdminsSetting {

    protected Map<String, EzyAdminSetting> adminsByName = new ConcurrentHashMap<>();
    protected Map<String, EzyAdminSetting> adminsByApiAccessToken = new ConcurrentHashMap<>();
    
    @XmlElement(name = "administrator")
    public void setItem(EzySimpleAdminSetting item) {
        adminsByName.put(item.getUsername(), item);
        adminsByApiAccessToken.put(item.getApiAccessToken(), item);
    }
    
    @Override
    public List<EzyAdminSetting> getAdmins() {
        return new ArrayList<>(adminsByName.values());
    }
    
    @Override
    public EzyAdminSetting getAdminByName(String username) {
        return adminsByName.get(username);
    }
    
    @Override
    public EzyAdminSetting getAdminByApiAccessToken(String token) {
        return adminsByApiAccessToken.get(token);
    }
    
    @Override
    public boolean containsAdminByName(String username) {
        return adminsByName.containsKey(username);
    }
    
    @Override
    public boolean containsAdminByApiAccessToken(String token) {
        return adminsByApiAccessToken.containsKey(token);
    }
    
    @Override
    public Map<Object, Object> toMap() {
        Map<Object, Object> map = new HashMap<>();
        List<Object> adminMaps = new ArrayList<>();
        for(EzyAdminSetting admin : adminsByName.values())
            adminMaps.add(admin.toMap());
        map.put("count", adminsByName.size());
        map.put("admins", adminMaps);
        return map;
    }
    
}
