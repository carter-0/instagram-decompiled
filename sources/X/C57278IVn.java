package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.save.api.SaveApiUtil;
import com.instagram.search.common.analytics.SearchContext;
import org.webrtc.EglBase14Impl;

/* renamed from: X.IVn  reason: case insensitive filesystem */
public final class C57278IVn implements JSz {
    public final FragmentActivity A00;
    public final AnonymousClass4DU A01;
    public final EXG A02;
    public final C249763kK A03;

    public final boolean AB7() {
        return true;
    }

    public final void D2t(UserSession userSession, String str, String str2) {
        new C55942Hq6(userSession, this.A01.getModuleName()).A00(this.A00, str, "igtv_user_view_profile_button");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Hj6, java.lang.Object] */
    public final void D32(Context context, UserSession userSession, 1Xj r24, int i) {
        C243373Ym r12;
        FragmentActivity fragmentActivity = this.A00;
        C249763kK r14 = this.A03;
        AnonymousClass4DU r10 = this.A01;
        1Xj r9 = r24;
        boolean CbC = r9.CbC();
        UserSession userSession2 = userSession;
        C340057kd.A00(userSession2).A04(r9, AnonymousClass05K.A01);
        1Ng A002 = AnonymousClass1Nd.A00(userSession2);
        if (CbC) {
            r12 = C243373Ym.NOT_SAVED;
        } else {
            r12 = C243373Ym.SAVED;
        }
        Context context2 = context;
        SaveApiUtil.A04(fragmentActivity, context2, userSession2, r9, r10, (JPV) null, r12, (SearchContext) null, r14, (String) null, (String) null, (String) null, i, 0, -1);
        ? obj = new Object();
        obj.A00 = r9;
        A002.A00(new C57074INo(obj, C54665HMw.ALL_MEDIA_AUTO_COLLECTION, (String) null, false));
        int i2 = 2131972635;
        if (CbC) {
            i2 = 2131975993;
        }
        C59689JTv.A01(context2, (String) null, i2, 0);
    }

    public C57278IVn(FragmentActivity fragmentActivity, AnonymousClass4DU r2, EXG exg, C249763kK r4) {
        this.A00 = fragmentActivity;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = exg;
    }

    public final void D2T(Context context, I9I i9i, MXT mxt, HNQ hnq) {
        C358248ab r2;
        int i;
        I9I i9i2 = i9i;
        switch (hnq.ordinal()) {
            case 0:
                i9i.A00(mxt);
                return;
            case 1:
                C55029Hb0.A00((DialogInterface.OnDismissListener) null, i9i.A01, i9i.A02, mxt.BPf());
                return;
            case 3:
                I72.A00(i9i.A01.requireContext(), i9i.A03, i9i.A02, mxt.BPf(), mxt.Ahy());
                return;
            case 4:
                AnonymousClass4DH r4 = i9i.A01;
                UserSession userSession = i9i.A02;
                1Xj BPf = mxt.BPf();
                String id = mxt.getId();
                if (id != null) {
                    I72.A06(r4, i9i.A03, userSession, BPf, id, AnonymousClass000.A00(3318));
                    return;
                }
                throw AnonymousClass7TE.A0y();
            case 5:
                AnonymousClass4DH r42 = i9i.A01;
                UserSession userSession2 = i9i.A02;
                1Xj BPf2 = mxt.BPf();
                String id2 = mxt.getId();
                if (id2 != null) {
                    I72.A05(r42, i9i.A03, userSession2, BPf2, id2, AnonymousClass000.A00(3318));
                    return;
                }
                throw AnonymousClass7TE.A0y();
            case 6:
                FragmentActivity requireActivity = i9i.A01.requireActivity();
                UserSession userSession3 = i9i.A02;
                String str = i9i.A04;
                1Xj BPf3 = mxt.BPf();
                String id3 = mxt.getId();
                if (id3 != null) {
                    I72.A04(requireActivity, userSession3, BPf3, str, id3);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                I72.A01(i9i.A01.requireContext(), i9i.A02, mxt.BPf(), i9i.A03, i9i.A04);
                return;
            case 14:
                AnonymousClass4DH r1 = i9i.A01;
                DbW.A1J(r1, new SUL(r1.requireActivity(), i9i.A02, 2EG.A0X, AnonymousClass000.A00(156), false));
                return;
            case 15:
                I72.A02(i9i, i9i.A01, i9i.A02, mxt.BPf());
                return;
            case 16:
                I72.A03(i9i, i9i.A01, i9i.A02, mxt.BPf(), mxt.CWu());
                return;
            case 17:
                AnonymousClass4DH r6 = i9i.A01;
                UserSession userSession4 = i9i.A02;
                1Xj BPf4 = mxt.BPf();
                r2 = DbW.A0U(r6);
                r2.A09(2131976473);
                r2.A08(2131976472);
                r2.A0J(new I90((DialogInterface.OnDismissListener) i9i2, r6, userSession4, BPf4, 4), 2131964053);
                i = 27;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                r2 = Dba.A0H(i9i.A01);
                r2.A09(2131964062);
                r2.A08(2131964061);
                r2.A0K(C56719I8z.A00(mxt, 29), 2131971974);
                i = 30;
                break;
            case 21:
                I72.A07(i9i.A01, i9i.A02, mxt.BPf(), i9i.A03.getModuleName());
                return;
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                1Xj BPf5 = mxt.BPf();
                UserSession userSession5 = i9i.A02;
                HNQ A002 = C56319HwW.A00(BPf5);
                if (A002 != null) {
                    C56319HwW.A01(i9i.A01, userSession5, mxt.BPf(), A002, "videox_viewer");
                    return;
                }
                return;
            case 32:
                AnonymousClass4DU r43 = i9i.A03;
                AnonymousClass4DH r12 = i9i.A01;
                FragmentActivity requireActivity2 = r12.requireActivity();
                1Xj BPf6 = mxt.BPf();
                UserSession userSession6 = i9i.A02;
                if (C52345GOp.A0C(userSession6, BPf6)) {
                    C250563lf.A0U(r12, requireActivity2, 28D.A2p, r43, userSession6, BPf6, (Integer) null);
                    return;
                }
                return;
            case 33:
            case 34:
            case 35:
            case 36:
                Fragment fragment = i9i.A01;
                Context requireContext = fragment.requireContext();
                UserSession userSession7 = i9i.A02;
                1Xj BPf7 = mxt.BPf();
                C52345GOp.A00.A0H(requireContext, AnonymousClass07i.A00(fragment), userSession7, BPf7, i9i.A03.getModuleName());
                return;
            default:
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("Option: ");
                A1A.append(hnq);
                A1A.append(" not supported, Entry point: ");
                A1A.append(this.A02);
                0wb.A03("IGTVLongPressOptionsHandlerImpl.onClickExtraMenuOptions", AnonymousClass7TF.A0l(".getEntryPointString()", A1A));
                return;
        }
        DbX.A16(C56719I8z.A00(i9i, i), r2);
    }
}
