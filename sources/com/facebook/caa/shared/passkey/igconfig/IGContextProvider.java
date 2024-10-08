package com.facebook.caa.shared.passkey.igconfig;

import X.09i;
import X.C12761T5v;
import X.C229382nI;
import X.DbU;
import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public abstract class IGContextProvider {
    public static final C229382nI A00(Context context) {
        FragmentActivity fragmentActivity;
        UserSession A07;
        if (!(context instanceof FragmentActivity) || (fragmentActivity = (FragmentActivity) context) == null || (A07 = 09i.A0A.A07(DbU.A06(fragmentActivity))) == null) {
            return null;
        }
        return C229382nI.A01((SparseArray) null, fragmentActivity, new C12761T5v(), A07);
    }

    public static final String A01(Context context) {
        Activity activity;
        UserSession A07;
        if (!(context instanceof FragmentActivity) || (activity = (Activity) context) == null || (A07 = 09i.A0A.A07(DbU.A06(activity))) == null) {
            return null;
        }
        return A07.A06;
    }
}
