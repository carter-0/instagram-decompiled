package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public abstract class K5K extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "BaseAlbumPickerFragment";
    public C60321JjQ A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return "album_picker";
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final boolean onBackPressed() {
        if (!(this instanceof KKN)) {
            return false;
        }
        KKN kkn = (KKN) this;
        if (kkn.A03 == null) {
            return false;
        }
        KKN.A00(kkn);
        C60321JjQ jjQ = kkn.A00;
        if (jjQ != null) {
            jjQ.Cv2();
            return true;
        }
        C51965G9l.A15();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        int A02 = AnonymousClass0fD.A02(74727009);
        K5K.super.onCreate(bundle);
        FragmentActivity requireActivity = requireActivity();
        UserSession A0l = AnonymousClass7TE.A0l(this.A01);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean("args_is_photo_only");
        } else {
            z = false;
        }
        C60321JjQ A002 = JTO.A0L(new KDJ(A0l, requireActivity, z), requireActivity).A00(C60321JjQ.class);
        0qQ.A0B(A002, 0);
        this.A00 = A002;
        AnonymousClass0fD.A09(-239107602, A02);
    }

    public final void onDestroyView() {
        int A02 = AnonymousClass0fD.A02(-107779318);
        super.onDestroyView();
        if (182.A06(0Tu.A05, getSession(), 36330754695250695L)) {
            C60321JjQ jjQ = this.A00;
            if (jjQ != null) {
                jjQ.A00 = null;
                jjQ.A03.A02.A08(jjQ.A01);
            } else {
                C51965G9l.A15();
                throw AnonymousClass00P.createAndThrow();
            }
        }
        AnonymousClass0fD.A09(-942980740, A02);
    }
}
