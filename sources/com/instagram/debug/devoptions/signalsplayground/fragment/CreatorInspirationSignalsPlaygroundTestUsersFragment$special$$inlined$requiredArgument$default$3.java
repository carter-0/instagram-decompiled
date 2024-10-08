package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.0Yg;
import X.0eO;
import X.C62320sa;
import X.DbS;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbY;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;

public final class CreatorInspirationSignalsPlaygroundTestUsersFragment$special$$inlined$requiredArgument$default$3 extends 0Yg implements C62320sa {
    public final /* synthetic */ String $key;
    public final /* synthetic */ String $key$inlined;
    public final /* synthetic */ Fragment $this_requiredArgument;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundTestUsersFragment$special$$inlined$requiredArgument$default$3(Fragment fragment, String str, String str2) {
        super(0);
        this.$this_requiredArgument = fragment;
        this.$key = str;
        this.$key$inlined = str2;
    }

    public final Object invoke() {
        final Fragment fragment = this.$this_requiredArgument;
        final String str = this.$key;
        Object A0k = DbU.A0k(0eO.A02, new C62320sa() {
            public final Object invoke() {
                Object A0Z;
                Class<String> cls = String.class;
                if (Serializable.class.isAssignableFrom(cls)) {
                    Fragment fragment = fragment;
                    String str = str;
                    int i = Build.VERSION.SDK_INT;
                    Bundle requireArguments = fragment.requireArguments();
                    if (i >= 33) {
                        A0Z = requireArguments.getSerializable(str, Object.class);
                    } else {
                        A0Z = DbV.A0l(requireArguments, str);
                    }
                } else if (DbS.A1b(cls)) {
                    A0Z = DbY.A0Z(fragment, str);
                } else {
                    throw DbY.A0Y(str);
                }
                if (A0Z instanceof String) {
                    return A0Z;
                }
                return null;
            }
        });
        if (A0k != null) {
            return A0k;
        }
        throw DbW.A0c("Argument not found for ", this.$key$inlined);
    }
}
