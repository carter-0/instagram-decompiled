package X;

import android.app.Activity;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.direct.model.thread.CreatorSubscriberThreadInfo;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;
import java.util.Map;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Pla  reason: case insensitive filesystem */
public final class C73899Pla extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73899Pla(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static 0t0 A00(Object obj, int i) {
        return AnonymousClass0eN.A01(new C73899Pla(obj, i));
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [java.lang.Object, X.PR9] */
    public final /* bridge */ /* synthetic */ Object invoke() {
        C242373Tu r0;
        C242373Tu AiM;
        C242373Tu AiM2;
        C242373Tu AiM3;
        NJm nJm;
        N4P n4p;
        switch (this.A00) {
            case 0:
            case 27:
                return this.A01;
            case 1:
            case 28:
                return DbT.A0r(this.A01);
            case 2:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return DbY.A0I(this.A01);
            case 3:
                return new C61539KBs(AnonymousClass7TE.A0l(((NKJ) this.A01).A01));
            case 4:
                return JTO.A0G(this.A01).findViewById(R.id.change_nickname_edit_text);
            case 5:
                return AnonymousClass7TF.A0G(JTO.A0G(this.A01), R.id.nickname_text_count_down);
            case 6:
                Fragment fragment = (Fragment) this.A01;
                C61057Jvv jvv = new C61057Jvv(AnonymousClass7TE.A16(fragment.requireContext(), 2131958994), (Integer) null);
                jvv.A00 = 2131959002;
                jvv.A01 = new C50468FcG(fragment, 4);
                jvv.A02 = true;
                return jvv;
            case 7:
                return new NLI(((NLD) this.A01).A00);
            case 8:
                nJm = (NJm) this.A01;
                break;
            case 9:
                nJm = (NJm) this.A01;
                N4P n4p2 = nJm.A04;
                if (n4p2 != null) {
                    int i = 1 - n4p2.A02;
                    C254793t3 r13 = n4p2.A0L;
                    String str = n4p2.A0Q;
                    int i2 = n4p2.A0A;
                    int i3 = n4p2.A08;
                    String str2 = n4p2.A0P;
                    ImageUrl imageUrl = n4p2.A0C;
                    String str3 = n4p2.A0N;
                    boolean z = n4p2.A12;
                    boolean z2 = n4p2.A10;
                    boolean z3 = n4p2.A0w;
                    int i4 = n4p2.A04;
                    int i5 = n4p2.A0B;
                    boolean z4 = n4p2.A0v;
                    boolean z5 = n4p2.A0o;
                    boolean z6 = n4p2.A0q;
                    boolean z7 = n4p2.A0n;
                    boolean z8 = n4p2.A0u;
                    boolean z9 = n4p2.A0z;
                    boolean z10 = n4p2.A0i;
                    boolean z11 = n4p2.A0k;
                    boolean z12 = n4p2.A13;
                    boolean z13 = n4p2.A0s;
                    boolean z14 = n4p2.A0r;
                    boolean z15 = n4p2.A0e;
                    boolean z16 = n4p2.A0d;
                    boolean z17 = n4p2.A0y;
                    Map map = n4p2.A0X;
                    MessagingUser messagingUser = n4p2.A0F;
                    List list = n4p2.A0T;
                    List list2 = n4p2.A00;
                    List list3 = n4p2.A0S;
                    C68179N3u n3u = n4p2.A0J;
                    List list4 = n4p2.A0R;
                    boolean z18 = n4p2.A0j;
                    String str4 = n4p2.A0O;
                    CreatorSubscriberThreadInfo creatorSubscriberThreadInfo = n4p2.A0G;
                    boolean z19 = n4p2.A0l;
                    boolean z20 = n4p2.A0p;
                    boolean z21 = n4p2.A0g;
                    boolean z22 = n4p2.A0x;
                    boolean z23 = n4p2.A0m;
                    C254793t3 r26 = n4p2.A0K;
                    int i6 = n4p2.A09;
                    C242243Te r23 = n4p2.A0E;
                    int i7 = n4p2.A07;
                    int i8 = n4p2.A06;
                    C327857Cl r7 = n4p2.A0I;
                    C272964li r6 = n4p2.A0H;
                    boolean z24 = n4p2.A11;
                    Long l = n4p2.A0M;
                    boolean z25 = n4p2.A0h;
                    int i9 = n4p2.A01;
                    Map map2 = n4p2.A0U;
                    boolean z26 = n4p2.A0f;
                    boolean z27 = n4p2.A0t;
                    C242373Tu r15 = n4p2.A0D;
                    int i10 = n4p2.A03;
                    int i11 = n4p2.A05;
                    Map map3 = n4p2.A0V;
                    Map map4 = n4p2.A0W;
                    0qQ.A0B(r13, 0);
                    C66583MXo.A1N(messagingUser, list, list2, list3, n3u);
                    C66584MXp.A15(r7, r6, map2);
                    n4p = new N4P(imageUrl, r15, r23, messagingUser, creatorSubscriberThreadInfo, r6, r7, n3u, r13, r26, l, str, str2, str3, str4, list, list2, list3, list4, map, map2, map3, map4, i2, i3, i4, i5, i6, i7, i8, i9, i, i10, i11, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, z27);
                } else {
                    n4p = null;
                }
                nJm.A04 = n4p;
                break;
            case 10:
                C72359P2y p2y = (C72359P2y) this.A01;
                DirectThreadKey A03 = C66647MaG.A03(p2y.A06.A08());
                AnonymousClass3U9 B33 = p2y.A05.B33(A03);
                if (B33 != null) {
                    r0 = B33.AiM();
                } else {
                    r0 = null;
                }
                boolean A02 = C331057Pi.A02(r0);
                IEA iea = new IEA(0, B33, A03, p2y);
                C358618bC r2 = p2y.A07;
                ? obj = new Object();
                obj.A04 = 2131958966;
                obj.A01 = 2131958967;
                obj.A0D = A02;
                obj.A08 = iea;
                obj.A09 = r2;
                return obj;
            case 11:
                C72359P2y p2y2 = (C72359P2y) this.A01;
                return new C50989Fmc(p2y2.A00, (View.OnClickListener) new C71395Oju(p2y2, 15), (CharSequence) "Bulk Send");
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C72359P2y p2y3 = (C72359P2y) this.A01;
                DirectThreadKey A032 = C66647MaG.A03(p2y3.A06.A08());
                AnonymousClass3U9 B332 = p2y3.A05.B33(A032);
                boolean z28 = true;
                if (B332 == null || (AiM = B332.AiM()) == null || AiM.A02 == 0) {
                    z28 = false;
                }
                return new PR9((CompoundButton.OnCheckedChangeListener) new IEA(1, B332, A032, p2y3), 2131959017, z28);
            case 13:
                C72359P2y p2y4 = (C72359P2y) this.A01;
                AnonymousClass3U9 B333 = p2y4.A05.B33(C66647MaG.A03(p2y4.A06.A08()));
                boolean z29 = false;
                if (!(B333 == null || (AiM2 = B333.AiM()) == null || AiM2.A03 != C242373Tu.A07)) {
                    z29 = true;
                }
                return new PR9((CompoundButton.OnCheckedChangeListener) new C71469OlD(p2y4, 16), p2y4.A08, 2131959034, z29);
            case 14:
                C72359P2y p2y5 = (C72359P2y) this.A01;
                AnonymousClass3U9 B334 = p2y5.A05.B33(C66647MaG.A03(p2y5.A06.A08()));
                boolean z30 = false;
                if (!(B334 == null || (AiM3 = B334.AiM()) == null || AiM3.A03 != 1)) {
                    z30 = true;
                }
                return new PR9((CompoundButton.OnCheckedChangeListener) new C71469OlD(p2y5, 17), p2y5.A08, 2131959035, z30);
            case 15:
                return new C70552OBa(C51965G9l.A0l(), (UserSession) this.A01);
            case 16:
                return C313746gw.A00(((P30) this.A01).A00);
            case 17:
                UserSession userSession = ((P30) this.A01).A00;
                return userSession.A01(C70552OBa.class, new C73899Pla(userSession, 15));
            case EglBase14Impl.EGLExt_SDK_VERSION:
                C67538MpX mpX = (C67538MpX) this.A01;
                return new C72542P9z(mpX.A00, mpX.A01, mpX.A02);
            case 19:
                return new C62036KWs(((C72542P9z) this.A01).A01);
            case 20:
                OHM ohm = (OHM) this.A01;
                if (ohm != null) {
                    P30 p30 = ohm.A01;
                    JTO.A0E(p30.A04).post(new C73203PYh(p30, ohm.A06));
                    break;
                }
                break;
            case 21:
                return 1bJ.A00(((C62036KWs) this.A01).A00);
            case 22:
                return new C71395Oju(this.A01, 28);
            case 23:
                ((RewriteTextBubbleViewPager) this.A01).A02.invoke();
                break;
            case 24:
                C68447NIk nIk = (C68447NIk) this.A01;
                if (nIk.isAdded()) {
                    C68447NIk.A03(nIk);
                    IgEditText igEditText = nIk.A03;
                    if (igEditText != null) {
                        igEditText.setText(DbW.A08(nIk.requireContext(), 2131972152));
                        break;
                    }
                }
                break;
            case 25:
                C68447NIk nIk2 = (C68447NIk) this.A01;
                if (nIk2.isAdded()) {
                    C68447NIk.A03(nIk2);
                    break;
                }
                break;
            case 26:
                C68447NIk.A01((C68447NIk) this.A01);
                break;
            case 30:
                return C48796EkJ.A00(AnonymousClass7TE.A0l(((NKN) this.A01).A0N));
            case 31:
                ((Activity) this.A01).finish();
                break;
            case 32:
                return C51971G9r.A0U(this.A01);
            case 33:
                return new C68535NMh(AnonymousClass7TE.A0l(((NKN) this.A01).A0N));
            case 34:
                return C313746gw.A00(((C68751NVl) this.A01).A00);
            case 35:
                return C69866NtU.A00(((C68749NVj) this.A01).A02);
            case 36:
                return C48796EkJ.A00(((C68750NVk) this.A01).A03);
            case 37:
                return new C69064Ne1((UserSession) this.A01);
            case Seq.RefTracker.REF_OFFSET:
                0nY.A00().ATE(new NRT(C66606MYs.A00(((2Dn) this.A01).A02)));
                break;
            case 43:
                return new 2Dn((UserSession) this.A01);
            case 44:
                UserSession userSession2 = (UserSession) this.A01;
                return new 2Db(C51966G9m.A0P(userSession2), userSession2, 2Dd.A00(userSession2));
            case 45:
                return 1bJ.A00((UserSession) this.A01);
            case 46:
                C66935MfU mfU = (C66935MfU) this.A01;
                return new C71001OVy(mfU.A00, mfU.A01, mfU.A02);
            case 47:
                C66935MfU mfU2 = (C66935MfU) this.A01;
                UserSession userSession3 = mfU2.A01;
                AnonymousClass4DH r9 = mfU2.A00;
                return new C70698OGt(r9.requireActivity(), r9, userSession3, (C67263Mkx) mfU2.A07.invoke(), new FGW(r9.requireActivity(), r9, userSession3), mfU2.A06);
            case 48:
                break;
            case 49:
                return new AnonymousClass72D((UserSession) this.A01);
            default:
                ((C69064Ne1) this.A01).A01.FIG(C68757NVs.A00);
                break;
        }
        NJm.A00(nJm);
        return C60340gF.A00;
    }
}
