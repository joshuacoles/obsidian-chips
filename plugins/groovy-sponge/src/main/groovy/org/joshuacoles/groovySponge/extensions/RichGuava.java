package org.joshuacoles.groovySponge.extensions;

import com.google.common.base.Optional;
import groovy.lang.Closure;
import groovy.transform.stc.ClosureParams;
import groovy.transform.stc.FirstParam;
import org.spongepowered.api.block.BlockType;

import javax.swing.text.html.Option;

public class RichGuava {
    public static <T> void call(Optional<T> self,
                                                  @ClosureParams(FirstParam.FirstGenericType.class) Closure<Void> closure) {
        if (self.isPresent()) closure.call(self.get());
    }

    public static <T> T call(Optional<T> self) {
        return self.get();
    }

}
