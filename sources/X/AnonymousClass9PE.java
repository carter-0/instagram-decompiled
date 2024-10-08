package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.9PE  reason: invalid class name */
public final class AnonymousClass9PE extends AnonymousClass4DH implements AnonymousClass4DR, 2bC, AnonymousClass0j6, B1P, C41817B1x, B1Q, C70992Zi, C60580id {
    public static final String __redex_internal_original_name = "QuickCaptureFragment";
    public C18078Vl7 A00;
    public C2366634p A01;
    public CameraConfiguration A02;
    public C279284yO A03 = AnonymousClass9QA.A00;
    public AnonymousClass9PL A04;
    public AVK A05;
    public AnonymousClass80Q A06;
    public C41837B2s A07;
    public C342817pD A08;
    public AnonymousClass80C A09;
    public C71162bE A0A;
    public 2L6 A0B;
    public String A0C = "stories_precapture_camera";
    public String A0D;
    public String A0E;
    public String A0F;
    public C231002qi A0G;
    public boolean A0H;
    public boolean A0I;
    public final AnonymousClass0eM A0J = C227642jf.A02(this);
    public final A57 A0K = new A57(this);

    public final GO6 Av1() {
        return null;
    }

    public final /* synthetic */ void CJK(MotionEvent motionEvent, Long l, boolean z) {
    }

    public final /* synthetic */ void DU7() {
    }

    public final void DvT(C279284yO r2) {
        C356848Vl r0;
        C356858Vm A002;
        0qQ.A0B(r2, 0);
        if (this.A03 != r2) {
            this.A03 = r2;
            A00();
            AnonymousClass80Q r02 = this.A06;
            if (r02 != null && (r0 = r02.A00.A18) != null && (A002 = r0.A00()) != null) {
                A002.A07();
                A002.A06();
            }
        }
    }

    public final void FHS(MotionEvent motionEvent) {
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        AnonymousClass7TF.A17(this, new C347597x4(bundle, this));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass80C r0 = new AnonymousClass80C();
        this.A09 = r0;
        registerLifecycleListener(r0);
        AnonymousClass7TF.A17(this, new C338807iZ(bundle, view, this));
        A01(this);
        C59728JVm A002 = AnonymousClass9PJ.A00(AnonymousClass7TE.A0l(this.A0J));
        0JA.A01();
        29E r3 = A002.A04;
        if (r3.A0E(585177486, A002.A00)) {
            r3.A0C("fragment_view_created", A002.A00);
        }
    }

    private final void A00() {
        AnonymousClass80Q r0;
        String str;
        C279284yO r1 = this.A03;
        if (r1 == AnonymousClass9QA.A00) {
            if (this.A0H) {
                str = "stories_gallery";
            } else {
                str = "stories_precapture_camera";
            }
        } else if (r1 instanceof AnonymousClass80O) {
            if (0qQ.A0K(this.A0C, "clips_postcapture_camera")) {
                return;
            }
            if (this.A0H) {
                str = "clips_gallery";
            } else {
                str = "clips_precapture_camera";
            }
        } else if (r1 == AnonymousClass80L.A00) {
            str = "live_precapture_camera";
        } else if (r1 == C3494180h.A00) {
            str = "note_precapture_camera";
        } else if (r1 == C363138jC.A00 && (r0 = this.A06) != null && r0.A00.A07) {
            str = "feed_precapture_camera";
        } else {
            return;
        }
        this.A0C = str;
        updateModuleNameV2_USE_WITH_CAUTION(str);
    }

    public static final void A01(AnonymousClass9PE r5) {
        2L6 r3;
        2L6 r1 = r5.A0B;
        if (r1 == null) {
            r1 = new 2L6(AnonymousClass12T.A00);
            r5.A0B = r1;
        }
        C262204Co r0 = r1.A00;
        if ((r0 == null || !r0.isActive()) && (r3 = r5.A0B) != null) {
            r3.A00(r5.requireActivity(), r5.getViewLifecycleOwner(), new C338967iq(r5), true);
        }
    }

    public final void A02() {
        AnonymousClass9PL r2 = this.A04;
        String str = "navigationPerfLogger";
        if (r2 != null) {
            boolean z = r2.A01;
            r2.A0E("partially_visible");
            AnonymousClass9PL r4 = this.A04;
            if (r4 != null) {
                Context requireContext = requireContext();
                2cc A002 = C71342cb.A00((0lg) this.A0J.getValue());
                if (!r4.A01) {
                    r4.A04();
                    r4.A01 = false;
                    r4.A0Q(requireContext, A002, (AnonymousClass0iw) null, false);
                }
                if (!z) {
                    C2366634p r0 = this.A01;
                    if (r0 == null) {
                        str = "qccNavComponent";
                    } else {
                        r0.A03();
                    }
                }
                AnonymousClass2uJ.A02(requireActivity());
                if (0qQ.A0K(this.A03, AnonymousClass9QA.A00)) {
                    C231002qi r02 = this.A0G;
                    if (r02 == null) {
                        str = "quickPromotionDelegate";
                    } else {
                        r02.Dh3();
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A03(AnonymousClass57C r2, String str) {
        AnonymousClass7TF.A17(this, new C41143Ap3(r2, this, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r2 == X.28D.A5D) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(com.instagram.creation.cameraconfiguration.CameraConfiguration r6) {
        /*
            r5 = this;
            X.80Q r0 = r5.A06
            if (r0 == 0) goto L_0x0040
            X.80R r4 = r0.A00
            if (r6 == 0) goto L_0x0039
            X.8Yz r1 = r4.A0W
            X.28D r0 = r4.A01
            r1.A0B(r0, r6)
            X.4yO r3 = r6.A03
        L_0x0011:
            r4.A02 = r3
        L_0x0013:
            X.28D r2 = r4.A01
            X.28D r0 = X.28D.A0a
            if (r2 == r0) goto L_0x001e
            X.28D r0 = X.28D.A5D
            r1 = 0
            if (r2 != r0) goto L_0x001f
        L_0x001e:
            r1 = 1
        L_0x001f:
            X.8jC r0 = X.C363138jC.A00
            if (r3 != r0) goto L_0x002d
            if (r1 == 0) goto L_0x002d
            if (r6 == 0) goto L_0x002d
            X.85X r0 = r4.A0n
            r0.A0A()
        L_0x002c:
            return
        L_0x002d:
            X.80J r0 = X.AnonymousClass80J.A00
            if (r3 != r0) goto L_0x002c
            if (r6 == 0) goto L_0x002c
            X.85X r0 = r4.A0n
            r0.A0B()
            return
        L_0x0039:
            X.4yO r3 = r4.A02
            if (r3 != 0) goto L_0x0013
            X.9QA r3 = X.AnonymousClass9QA.A00
            goto L_0x0011
        L_0x0040:
            com.instagram.creation.cameraconfiguration.CameraConfiguration r0 = r5.A02
            if (r0 != 0) goto L_0x002c
            r5.A02 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9PE.A04(com.instagram.creation.cameraconfiguration.CameraConfiguration):void");
    }

    public final void A05(String str, String str2, String str3, String str4, int i) {
        AnonymousClass80Q r1 = this.A06;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        if (r1 != null) {
            this.A0J.getValue();
            C71162bE r0 = this.A0A;
            if (r0 == null) {
                0qQ.A0F("navigationState");
                throw AnonymousClass00P.createAndThrow();
            }
            String A002 = C371068xW.A00(C348017xk.A00(r0.A02));
            AnonymousClass80R r12 = r1.A00;
            if (r12.A1I != null) {
                AnonymousClass848 r13 = r12.A0I;
                if (!r13.A02(str)) {
                    r13.A00.Epw(new AnonymousClass8YD(AnonymousClass84B.OTHER, str5, A002, (String) null, str6, str7, str4, i, AnonymousClass7TF.A1V(str2)));
                    return;
                }
                return;
            }
            return;
        }
        this.A0D = str;
        this.A0E = str2;
        this.A0F = str3;
    }

    public final /* synthetic */ double BaQ() {
        return 0.0d;
    }

    public final /* synthetic */ boolean BuP() {
        return false;
    }

    public final boolean Ccw(MotionEvent motionEvent) {
        AnonymousClass80Q r0 = this.A06;
        if (r0 == null) {
            return false;
        }
        AnonymousClass80R r2 = r0.A00;
        AnonymousClass80U r4 = r2.A1f;
        switch (((AnonymousClass80V) ((AnonymousClass80T) r4).A01.A00.first).ordinal()) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 25:
            case 27:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 37:
            case 45:
            case 47:
            case 48:
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
            case 51:
            case 52:
            case 54:
            case 57:
            case 59:
            case 67:
            case 71:
            case 74:
            case 75:
            case 76:
            case 78:
            case 84:
            case 87:
                return false;
            default:
                C3510287h r1 = r2.A1r;
                if (r1.A00().A0K) {
                    return false;
                }
                Integer num = r1.A00().A0J;
                num.getClass();
                if (num.equals(AnonymousClass05K.A0j)) {
                    return false;
                }
                AnonymousClass8WX r12 = r2.A1N;
                if (r12 != null && r12.A00().A01 != null && r12.A00().A01.A00 != 0.0f) {
                    return false;
                }
                Object obj = r2.A0W.A08.A00;
                if (obj instanceof AnonymousClass80O) {
                    AnonymousClass8IY AuT = r2.A1j.AuT();
                    if (!(AuT.A01 == AnonymousClass8IX.CAMERA_IDLE && AuT.A00.ordinal() == 0)) {
                        return false;
                    }
                }
                if (obj instanceof C363138jC) {
                    AnonymousClass8ZV A0P = r2.A0J.getChildFragmentManager().A0P(R.id.feed_gallery_fragment_holder);
                    if (A0P instanceof AnonymousClass8ZV) {
                        JW7 jw7 = A0P.A06;
                        if (jw7 == null) {
                            0qQ.A0F("galleryPickerView");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        Rect A0W = AnonymousClass7TE.A0W();
                        if ((JW7.A0Q(jw7) && jw7.A0W) || ((FragmentActivity) 0mE.A01(jw7.getContext(), FragmentActivity.class)).getSupportFragmentManager().A0R(K6F.__redex_internal_original_name) != null) {
                            return false;
                        }
                        View view = jw7.A07;
                        if (view != null && view.getGlobalVisibleRect(A0W) && jw7.A0V) {
                            return false;
                        }
                    }
                }
                if (r2.A1j.CUu() == 2 || r2.A0s.A0A() || r2.A1W.A00().AuF() == AnonymousClass05K.A0N) {
                    return false;
                }
                C352888Fl r22 = r2.A0l;
                if (r22.A08.A0M.get() == 1 || r22.A08.A0M.get() == 2 || !r4.CZe() || !r22.A0X()) {
                    return false;
                }
                return true;
        }
    }

    public final void D19(boolean z) {
        String str;
        if (z) {
            this.A0I = true;
            C279284yO r1 = this.A03;
            if (r1 instanceof AnonymousClass9QA) {
                str = "stories_postcapture_camera";
            } else {
                if (r1 instanceof AnonymousClass80O) {
                    str = "clips_postcapture_camera";
                }
                updateModuleNameV2_USE_WITH_CAUTION(this.A0C);
            }
            this.A0C = str;
            updateModuleNameV2_USE_WITH_CAUTION(this.A0C);
        } else if (this.A0I) {
            this.A0C = "clips_precapture_camera";
            A00();
            this.A0I = false;
        }
    }

    public final void DHb(boolean z) {
        if (z != this.A0H) {
            this.A0H = z;
            A00();
        }
    }

    public final void DTa() {
        AnonymousClass80Q r0 = this.A06;
        if (r0 != null) {
            r0.A00.A07 = true;
        }
        A00();
    }

    public final 0jB E4x() {
        0jB r3 = new 0jB();
        r3.A04(new 0j9(AnonymousClass05K.A0Y, "camera_session_id"), AnonymousClass7TF.A0g(AnonymousClass7TE.A0l(this.A0J)));
        return r3;
    }

    public final /* synthetic */ boolean Erl() {
        return false;
    }

    public final boolean getCanShowVoiceMessageBar() {
        return false;
    }

    public final String getModuleName() {
        return this.A0C;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return (AnonymousClass0wW) this.A0J.getValue();
    }

    public final boolean onBackPressed() {
        AnonymousClass80Q r0 = this.A06;
        if (r0 == null || !r0.A06()) {
            return false;
        }
        return true;
    }

    public final void DV0(C71162bE r3) {
        int A0D2 = AnonymousClass7TG.A0D(r3, 1461970012);
        AnonymousClass7TF.A17(this, new C338957ip(this, r3));
        AnonymousClass0fD.A0A(1986652017, A0D2);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(417748447);
        AnonymousClass9PE.super.onCreate(bundle);
        1Jk.A04(this);
        C71162bE r3 = this.A0A;
        Context context = null;
        if (r3 == null) {
            0qQ.A0F("navigationState");
            throw AnonymousClass00P.createAndThrow();
        }
        A57 a57 = this.A0K;
        AnonymousClass0eM r5 = this.A0J;
        AnonymousClass9PL r6 = new AnonymousClass9PL(AnonymousClass7TE.A0l(r5), a57, r3);
        r6.A0Q(requireContext(), C71342cb.A00((0lg) r5.getValue()), (AnonymousClass0iw) null, true);
        this.A04 = r6;
        this.A01 = r6.A02("QCC");
        if (bundle != null) {
            this.A02 = C358098aM.A00(C338817ia.A00(bundle.getString("SAVE_INSTANCE_KEY_LAST_CAMERA_DESTINATION", AnonymousClass9QA.A00.A02)), new C358088aL[0]);
            this.A0D = bundle.getString("SAVE_INSTANCE_KEY_AR_EFFECT_ID");
        }
        setModuleNameV2(this.A0C);
        1YN A002 = AnonymousClass2bO.A00();
        UserSession A0l = AnonymousClass7TE.A0l(r5);
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A16;
        AnonymousClass2bO.A00();
        this.A0G = A002.A01(this, this, A0l, 2bV.A08((C71202bS) null), quickPromotionSlot);
        UserSession A0l2 = AnonymousClass7TE.A0l(r5);
        Context context2 = getContext();
        if (context2 != null) {
            context = context2.getApplicationContext();
        }
        if (C362988ir.A01(context, A0l2)) {
            1pd.A00(C362988ir.A00()).A00(requireContext(), AnonymousClass7TE.A0l(r5), new C40618Afg(this, 0), __redex_internal_original_name);
        }
        0lg r32 = (0lg) r5.getValue();
        this.A08 = new C342817pD((float) 182.A00(AnonymousClass7TF.A0H(r32), r32, 37174677113668205L));
        C59728JVm A003 = AnonymousClass9PJ.A00(AnonymousClass7TE.A0l(r5));
        29E r33 = A003.A04;
        if (r33.A0E(585177486, A003.A00)) {
            r33.A0C("fragment_created", A003.A00);
        }
        AnonymousClass0fD.A09(-1538381685, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(59943673);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_quick_capture, viewGroup, false);
        AnonymousClass0fD.A09(111862770, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1781293023);
        super.onDestroy();
        C18078Vl7 vl7 = this.A00;
        if (vl7 != null) {
            XBm xBm = vl7.A0B;
            if (xBm.isConnected()) {
                xBm.disconnect();
            }
        }
        AnonymousClass0fD.A09(1373587661, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(2082327495);
        super.onDestroyView();
        C71162bE r0 = this.A0A;
        if (r0 == null) {
            0qQ.A0F("navigationState");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A01(this);
        AnonymousClass80Q r02 = this.A06;
        if (r02 != null) {
            r02.A00();
        }
        this.A06 = null;
        unregisterLifecycleListener(this.A09);
        AnonymousClass80C r03 = this.A09;
        if (r03 != null) {
            r03.onDestroyView();
        }
        this.A09 = null;
        AnonymousClass0fD.A09(-1421251991, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(2055031146);
        C59728JVm A002 = AnonymousClass9PJ.A00(AnonymousClass7TE.A0l(this.A0J));
        AnonymousClass80Q r0 = this.A06;
        28D r7 = null;
        if (r0 != null) {
            r7 = r0.A00.A01;
        }
        0JA.A01();
        29E r6 = A002.A04;
        if (r6.A0E(585177486, A002.A00)) {
            r6.A0C("fragment_resumed", A002.A00);
            r6.A09(A002.A00, "late_entry_point", String.valueOf(r7));
        }
        C71162bE r1 = this.A0A;
        if (r1 == null) {
            0qQ.A0F("navigationState");
            throw AnonymousClass00P.createAndThrow();
        }
        DV0(r1);
        super.onResume();
        C71162bE r02 = this.A0A;
        if (!(r02 == null || r02.A01 == 0.0f)) {
            C357628Yy.A01(requireActivity(), requireContext().getColor(R.color.fds_transparent));
            AnonymousClass2uJ.A02(requireActivity());
        }
        AnonymousClass0fD.A09(66358642, A022);
    }

    public final /* synthetic */ boolean Ccu(boolean z) {
        return false;
    }
}
