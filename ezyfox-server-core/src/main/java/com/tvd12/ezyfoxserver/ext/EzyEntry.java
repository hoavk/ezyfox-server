/**
 *
 */
package com.tvd12.ezyfoxserver.ext;

import com.tvd12.ezyfox.util.EzyDestroyable;
import com.tvd12.ezyfox.util.EzyStartable;

/**
 * @author tavandung12
 *
 */
public interface EzyEntry extends EzyStartable, EzyDestroyable {

    @Override
    default void start() throws Exception {}

    @Override
    default void destroy() {}

}
