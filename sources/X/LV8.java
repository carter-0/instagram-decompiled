package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.appreciation.analytics.creator.CreatorLoggingData;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.react.modules.base.IgReactQEModule;

public final class LV8 implements DialogInterface.OnDismissListener {
    public final int A00;
    public final Object A01;

    public LV8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C358248ab r1, Object obj, int i) {
        r1.A0f(new LV8(obj, i));
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        boolean z;
        0xY r1;
        String str;
        switch (this.A00) {
            case 0:
                C60185Jh4 jh4 = (C60185Jh4) ((K89) this.A01).A02.getValue();
                LTO lto = jh4.A00;
                Integer num = AnonymousClass05K.A04;
                CreatorLoggingData creatorLoggingData = jh4.A01;
                lto.A0C(Boolean.valueOf(creatorLoggingData.A01), Boolean.valueOf(creatorLoggingData.A02), num, creatorLoggingData.A00);
                return;
            case 1:
                LRN lrn = (LRN) this.A01;
                C60775Jr6 A012 = LRN.A01(lrn, AnonymousClass05K.A00, AnonymousClass05K.A04);
                LRO lro = lrn.A01;
                String str2 = lrn.A00.A03;
                AnonymousClass7TG.A1N(str2, A012);
                0Aj A0e = AnonymousClass7TE.A0e(lro.A02, "user_click_appreciationfeed_exit");
                if (A0e.isSampled()) {
                    JTU.A0t(LRO.A00(A0e, lro, Dbg.A00(), str2), A0e, A012);
                    A0e.Cgf();
                    return;
                }
                return;
            case 2:
                1Yh.A01((1Yh) this.A01);
                return;
            case 3:
                1Au.A00(((KB5) this.A01).A0P).A1a(true);
                return;
            case 4:
                if (dialogInterface != null) {
                    JWG jwg = (JWG) this.A01;
                    if (dialogInterface.equals(jwg.A00)) {
                        jwg.A00 = null;
                        jwg.A02 = null;
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((C59867Jal) this.A01).A02 = null;
                return;
            case 6:
                AnonymousClass7TH.A0R(((EditMediaInfoFragment) this.A01).mPostOverlayView);
                return;
            case 7:
                ((C61495KAa) this.A01).A03.getParentFragmentManager().A13();
                return;
            case 8:
                K5H k5h = ((C65424Lt4) this.A01).A01;
                k5h.A0R = false;
                k5h.A01 = null;
                return;
            case 9:
                1Au.A00((UserSession) this.A01).A1W(true);
                return;
            case 10:
                z = true;
                r1 = AnonymousClass7TE.A0p(DbX.A0h(((K5C) this.A01).A0A));
                str = "has_seen_open_sender_reel_preview_dialog";
                break;
            case 11:
                z = true;
                r1 = AnonymousClass7TE.A0p(DbX.A0h(((K5C) this.A01).A0A));
                str = "has_seen_open_receiver_reel_preview_dialog";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                DbX.A1I((Fragment) this.A01);
                return;
            case 13:
                C63769L6b l6b = ((LQh) this.A01).A05;
                CallerContext callerContext = C59719JVd.A01;
                JTT.A1N(l6b.A01.A00());
                C14625TzX tzX = l6b.A02.mListAdapter;
                if (tzX != null) {
                    tzX.A07();
                    return;
                }
                return;
            case 14:
                DbS.A1U(this.A01);
                return;
            case 15:
                return;
            default:
                DbX.A10(DbT.A0E(this.A01), AnonymousClass37D.A00);
                return;
        }
        r1.E5T(str, z);
        r1.apply();
    }
}
