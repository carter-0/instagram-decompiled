package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicBrowseCategory;

/* renamed from: X.LuV  reason: case insensitive filesystem */
public final class C65507LuV implements C3515989m {
    public final int A00;
    public final Object A01;

    public C65507LuV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DSk() {
        switch (this.A00) {
            case 0:
                ((C65147LoB) this.A01).dismiss();
                return;
            case 1:
                C65146LoA loA = (C65146LoA) this.A01;
                loA.A07.invoke();
                loA.dismiss();
                return;
            case 2:
                ((C65145Lo9) this.A01).dismiss();
                return;
            case 3:
                return;
            default:
                ((Lo8) this.A01).dismiss();
                return;
        }
    }

    public final void DSm(C66569MWx mWx, MusicBrowseCategory musicBrowseCategory, String str, String str2) {
        switch (this.A00) {
            case 0:
                ((C65147LoB) this.A01).A01(mWx);
                return;
            case 1:
                C65146LoA loA = (C65146LoA) this.A01;
                if (!C65146LoA.A00(loA)) {
                    loA.dismiss();
                    loA.A06.DUG(mWx);
                }
                loA.A01 = str2;
                return;
            case 2:
                C65145Lo9 lo9 = (C65145Lo9) this.A01;
                Fragment fragment = lo9.A03;
                FragmentActivity activity = fragment.getActivity();
                if (activity != null) {
                    AudioOverlayTrack A002 = C63347KvU.A00(mWx, 30000);
                    String str3 = lo9.A06;
                    String str4 = lo9.A07;
                    Bundle A0a = AnonymousClass7TE.A0a();
                    A0a.putParcelable("args_audio_track", A002);
                    A0a.putBoolean("args_has_existing_snippet_selection", false);
                    A0a.putString("args_media_id", str3);
                    A0a.putString("args_music_browse_session_full_id", str4);
                    Dba.A0K(activity, A0a, lo9.A05, ModalActivity.class, C273654mx.A00(696)).A0D(fragment, 1004);
                    return;
                }
                return;
            case 3:
                C74511Pw6 pw6 = ((C68464NJc) this.A01).A02;
                if (pw6 != null) {
                    pw6.DT2(mWx);
                    return;
                }
                return;
            default:
                Lo8 lo8 = (Lo8) this.A01;
                Activity activity2 = lo8.A01;
                DbV.A0Y(activity2, JTU.A07(C63347KvU.A00(mWx, 30000), lo8.A06, false), lo8.A04, ModalActivity.class, "clips_edit_music_editor").A0A(activity2, 1004);
                return;
        }
    }

    public final /* synthetic */ void CI8(int i, int i2, Intent intent) {
    }
}
