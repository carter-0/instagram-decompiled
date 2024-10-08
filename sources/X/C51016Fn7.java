package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.url.UrlHandlerActivity;

/* renamed from: X.Fn7  reason: case insensitive filesystem */
public final class C51016Fn7 implements C51920G7o {
    public static final 0bY A00 = DbW.A0G();

    public final boolean EHn() {
        return true;
    }

    public final Bundle AFW(AnonymousClass0wW r15, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Uri A01 = 0cp.A01(A00, str);
        if (A01 == null) {
            return null;
        }
        String scheme = A01.getScheme();
        String host = A01.getHost();
        String path = A01.getPath();
        if (A01.isHierarchical()) {
            str3 = A01.getQueryParameter("story-camera-mode");
            str4 = A01.getQueryParameter("effect_id");
            str5 = A01.getQueryParameter("entrypoint");
            str6 = A01.getQueryParameter("ch");
            str7 = A01.getQueryParameter("revision_id");
            str8 = A01.getQueryParameter("unlocked_sticker_id");
            str2 = A01.getQueryParameter("interactive_sticker_id");
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
        }
        if (!"ig".equalsIgnoreCase(scheme) || !"story-camera".equals(host)) {
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                return null;
            }
            if ((!"instagram.com".equals(host) && !"www.instagram.com".equals(host)) || !"/linking/create_story".equals(path)) {
                return null;
            }
        }
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("story-camera-mode-key", str3);
        A0a.putString("effect_id_key", str4);
        A0a.putString("entrypoint_key", str5);
        A0a.putString("ch_key", str6);
        A0a.putString("revisionID_key", str7);
        A0a.putString("unlocked_sticker_id", str8);
        A0a.putString("interactive_sticker_id", str2);
        return A0a;
    }

    public final void CI1(Bundle bundle, FragmentActivity fragmentActivity, AnonymousClass0wW r9) {
        Intent A01 = AnonymousClass14B.A00().A01(fragmentActivity);
        Uri.Builder A07 = DbW.A07("instagram://story-camera");
        String string = bundle.getString("story-camera-mode-key", (String) null);
        if (string != null) {
            A07.appendQueryParameter(DatePickerDialogModule.ARG_MODE, string);
        }
        String string2 = bundle.getString("effect_id_key", (String) null);
        if (string2 != null) {
            A07.appendQueryParameter("effect_id", string2);
        }
        String string3 = bundle.getString("entrypoint_key", (String) null);
        if (string3 != null) {
            A07.appendQueryParameter("entrypoint", string3);
        }
        String string4 = bundle.getString("ch_key", (String) null);
        if (string4 != null) {
            A07.appendQueryParameter("test_link_crypto_hash", string4);
        }
        String string5 = bundle.getString("revisionID_key", (String) null);
        if (string5 != null) {
            A07.appendQueryParameter("test_link_revision_id", string5);
        }
        String string6 = bundle.getString("unlocked_sticker_id", (String) null);
        if (string6 != null) {
            A07.appendQueryParameter("unlocked_sticker_id", string6);
        }
        String string7 = bundle.getString("interactive_sticker_id", (String) null);
        if (string6 != null) {
            A07.appendQueryParameter("interactive_sticker_id", string7);
        }
        Dba.A0o(fragmentActivity, A01, A07);
        if (fragmentActivity instanceof UrlHandlerActivity) {
            fragmentActivity.finish();
        }
    }
}
