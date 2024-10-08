package X;

import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import java.util.Collection;
import java.util.Set;

public final class SQ7 {
    public static boolean A02(Object obj, Collection collection, Collection collection2) {
        if (collection == null) {
            if (collection2 != null) {
                return !collection2.contains(obj);
            }
            return false;
        } else if (collection2 == null) {
            return collection.contains(obj);
        } else {
            return !collection2.contains(obj) || collection.contains(obj);
        }
    }

    public static T9R A00(Set set, Set set2) {
        if (set2 != null || (set != null && !set.isEmpty())) {
            return new T9R(set, set2);
        }
        return null;
    }

    public static boolean A01(BeanDeserializerBase beanDeserializerBase, Object obj) {
        return A02(obj, beanDeserializerBase.A0C, beanDeserializerBase.A0D);
    }
}
