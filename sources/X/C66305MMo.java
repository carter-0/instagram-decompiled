package X;

import android.content.Context;
import android.view.View;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.MMo  reason: case insensitive filesystem */
public final class C66305MMo extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66305MMo(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static View A00(C66305MMo mMo) {
        return (View) ((C64855LjH) mMo.A01).A06.getValue();
    }

    public static AnonymousClass0eM A01(Object obj, int i) {
        return AnonymousClass1YB.A00(new C66305MMo(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v0, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v0, resolved type: X.4DH} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C40377AbA A02() {
        /*
            r62 = this;
            r0 = r62
            java.lang.Object r7 = r0.A01
            X.Lm3 r7 = (X.C65025Lm3) r7
            X.4DH r13 = r7.A05
            androidx.fragment.app.FragmentActivity r1 = r13.requireActivity()
            r0 = 177(0xb1, float:2.48E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.07f r4 = r1.getViewModelStore()
            androidx.fragment.app.FragmentActivity r0 = r13.requireActivity()
            com.instagram.common.session.UserSession r6 = r7.A06
            r3 = 0
            r15 = 0
            X.80c r2 = new X.80c
            r2.<init>(r0, r6, r3, r3)
            X.2YP r0 = X.AnonymousClass2YP.A00
            X.2YN r1 = new X.2YN
            r1.<init>(r2, r4, r0)
            java.lang.Class<X.8Yz> r0 = X.C357638Yz.class
            X.2YL r5 = r1.A00(r0)
            X.8Yz r5 = (X.C357638Yz) r5
            X.80L r0 = X.AnonymousClass80L.A00
            X.28D r1 = X.28D.A2y
            r5.A0D(r1, r0)
            androidx.fragment.app.FragmentActivity r43 = r13.requireActivity()
            r38 = 1
            X.82Y r14 = new X.82Y
            r16 = r15
            r18 = r15
            r19 = r15
            r20 = r15
            r21 = r15
            r22 = r15
            r23 = r15
            r24 = r15
            r25 = r15
            r26 = r15
            r27 = r15
            r28 = r15
            r29 = r15
            r30 = r15
            r31 = r15
            r32 = r15
            r33 = r15
            r34 = r15
            r35 = r3
            r36 = r3
            r37 = r3
            r39 = r3
            r40 = r3
            r41 = r3
            r42 = r3
            r17 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            X.0qQ.A0B(r1, r3)
            X.82o r0 = new X.82o
            r0.<init>(r14)
            X.82p r8 = new X.82p
            r8.<init>(r1, r0, r15)
            X.0eM r9 = r7.A0C
            java.lang.Object r11 = r9.getValue()
            X.80T r11 = (X.AnonymousClass80T) r11
            java.lang.Integer r16 = X.AnonymousClass05K.A08
            r0 = 9
            X.MMo r10 = new X.MMo
            r10.<init>(r7, r0)
            r0 = 10
            X.MMo r4 = new X.MMo
            r4.<init>(r7, r0)
            r1 = 11
            X.MMo r0 = new X.MMo
            r0.<init>(r7, r1)
            boolean r1 = X.2CC.A00(r16)
            if (r1 != 0) goto L_0x00f4
            java.lang.Object r11 = r10.invoke()
            X.81E r11 = (X.AnonymousClass81E) r11
        L_0x00b3:
            X.88Z r11 = (X.AnonymousClass88Z) r11
            java.lang.Object r10 = r9.getValue()
            X.80T r10 = (X.AnonymousClass80T) r10
            X.0gy r45 = X.AnonymousClass07i.A00(r13)
            android.view.View r12 = r7.A04
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r9 = r7.A03
            if (r9 != 0) goto L_0x00cf
            java.lang.String r0 = "interactiveDrawableContainer"
        L_0x00c7:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00cf:
            X.3E6 r4 = r7.A07
            X.0eM r0 = r7.A0E
            java.lang.Object r3 = r0.getValue()
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r3 = (com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider) r3
            X.88K r2 = r7.A02
            if (r2 != 0) goto L_0x00e0
            java.lang.String r0 = "eyedropperColorPickerController"
            goto L_0x00c7
        L_0x00e0:
            X.8BF r58 = new X.8BF
            r58.<init>()
            X.0eM r0 = r7.A0B
            java.lang.Object r1 = r0.getValue()
            X.8AL r1 = (X.AnonymousClass8AL) r1
            X.8BQ r0 = r7.A01
            if (r0 != 0) goto L_0x011b
            java.lang.String r0 = "colorPaletteController"
            goto L_0x00c7
        L_0x00f4:
            java.lang.Class<X.88Y> r1 = X.AnonymousClass88Y.class
            java.lang.ClassLoader r3 = r1.getClassLoader()
            java.lang.Class[] r2 = new java.lang.Class[]{r1}
            X.81C r1 = new X.81C
            r17 = r10
            r18 = r4
            r19 = r0
            r20 = r38
            r14 = r1
            r15 = r11
            r14.<init>(r15, r16, r17, r18, r19, r20)
            X.ArB r0 = new X.ArB
            r0.<init>(r1)
            java.lang.Object r11 = java.lang.reflect.Proxy.newProxyInstance(r3, r2, r0)
            if (r11 == 0) goto L_0x0141
            X.88Y r11 = (X.AnonymousClass88Y) r11
            goto L_0x00b3
        L_0x011b:
            X.AbA r42 = new X.AbA
            r47 = r13
            r50 = r5
            r51 = r3
            r52 = r8
            r53 = r0
            r54 = r2
            r55 = r1
            r56 = r7
            r57 = r11
            r59 = r10
            r60 = r9
            r61 = r7
            r44 = r12
            r46 = r13
            r48 = r6
            r49 = r4
            r42.<init>(r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)
            return r42
        L_0x0141:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystem"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66305MMo.A02():X.AbA");
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        View view;
        int i;
        switch (this.A00) {
            case 1:
                return new KCJ((UserSession) this.A01);
            case 2:
                view = ((C65025Lm3) this.A01).A04;
                i = R.id.clear_button;
                break;
            case 3:
                view = ((C65025Lm3) this.A01).A04;
                i = R.id.done_button;
                break;
            case 4:
                view = ((C65025Lm3) this.A01).A04;
                i = R.id.iglive_floating_button_picker_stub;
                break;
            case 5:
                C65025Lm3 lm3 = (C65025Lm3) this.A01;
                AnonymousClass4DH r0 = lm3.A05;
                Context requireContext = r0.requireContext();
                UserSession userSession = lm3.A06;
                AnonymousClass8AL r2 = new AnonymousClass8AL(requireContext, AnonymousClass7TH.A06(lm3.A0A), r0.getViewLifecycleOwner(), (GalleryPickerServiceDataSource) null, userSession, (C357638Yz) null, (TargetViewSizeProvider) lm3.A0E.getValue(), (AnonymousClass8AH) null, (X3Z) null, (AnonymousClass8AK) null, (C3504884v) null, (AnonymousClass825) null, R.drawable.floating_button_background, false, false, false);
                r2.A0P.setVisibility(0);
                return r2;
            case 6:
            case 25:
            case 30:
            case 45:
                return this.A01;
            case 7:
            case 26:
            case 31:
            case 46:
                return DbT.A0r(this.A01);
            case 9:
            case 10:
            case 11:
                C65025Lm3 lm32 = (C65025Lm3) this.A01;
                UserSession userSession2 = lm32.A06;
                AnonymousClass4DH r02 = lm32.A05;
                return new AnonymousClass88Y(r02, r02, userSession2);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return A02();
            case 13:
                C65025Lm3 lm33 = (C65025Lm3) this.A01;
                return C226132fh.A00(lm33.A05.requireActivity(), lm33.A06);
            case 14:
                return new KCK(((C65025Lm3) this.A01).A06);
            case 15:
                view = ((C64856LjI) this.A01).A02;
                i = R.id.live_badges_button;
                break;
            case 16:
                view = ((C64856LjI) this.A01).A02;
                i = R.id.live_expand_button;
                break;
            case 17:
                view = ((C64856LjI) this.A01).A02;
                i = R.id.heart_button;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                view = ((C64856LjI) this.A01).A02;
                i = R.id.live_invite_button;
                break;
            case 19:
                view = ((C64856LjI) this.A01).A02;
                i = R.id.new_requests_to_join_badge;
                break;
            case 20:
                view = ((C64856LjI) this.A01).A02;
                i = R.id.live_options_button;
                break;
            case 21:
                view = ((C64856LjI) this.A01).A02;
                View findViewById = view.findViewById(R.id.qa_mode_button_with_badge);
                if (findViewById == null) {
                    i = R.id.qa_mode_button;
                    break;
                } else {
                    return findViewById;
                }
            case 22:
                view = ((C64856LjI) this.A01).A02;
                i = R.id.qa_mode_button_unread_count_badge;
                break;
            case 23:
                view = ((C64856LjI) this.A01).A02;
                View findViewById2 = view.findViewById(R.id.live_rooms_button_with_badge);
                if (findViewById2 == null) {
                    i = R.id.live_rooms_button;
                    break;
                } else {
                    return findViewById2;
                }
            case 24:
                view = ((C64856LjI) this.A01).A02;
                i = R.id.direct_share_button;
                break;
            case 28:
                view = ((C64856LjI) this.A01).A02;
                i = R.id.ssi_broadcaster_button;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                C64856LjI ljI = (C64856LjI) this.A01;
                int ordinal = ljI.A06.ordinal();
                if (ordinal == 0) {
                    return new KCM(ljI.A04);
                }
                if (ordinal == 2) {
                    return new KCL(ljI.A04);
                }
                return new KD8(ljI.A03, ljI.A04);
            case 33:
                return new KCN((UserSession) this.A01);
            case 34:
                View view2 = ((C64855LjH) this.A01).A04;
                if (view2.findViewById(R.id.iglive_chain_preview_view_stub) != null) {
                    return JTT.A0E(view2, R.id.iglive_chain_preview_view_stub);
                }
                View findViewById3 = view2.findViewById(R.id.iglive_chain_preview_view);
                0qQ.A0A(findViewById3);
                return findViewById3;
            case 35:
                view = A00(this);
                i = R.id.reel_viewer_profile_picture;
                break;
            case 36:
                view = A00(this);
                i = R.id.iglive_chain_preview_header_layout;
                break;
            case 37:
                view = A00(this);
                i = R.id.iglive_header_main_text;
                break;
            case 38:
                return new C240933Nf(A00(this));
            case 39:
                view = A00(this);
                i = R.id.iglive_chain_preview_main_text;
                break;
            case 40:
                view = A00(this);
                i = R.id.iglive_header_options;
                break;
            case Seq.NULL_REFNUM:
                view = A00(this);
                i = R.id.iglive_chain_preview_segmented_progress_bar;
                break;
            case Seq.RefTracker.REF_OFFSET:
                view = A00(this);
                i = R.id.iglive_chain_preview_thumbnail_image;
                break;
            case 43:
                view = A00(this);
                i = R.id.iglive_watch_live_button;
                break;
            case 44:
                view = A00(this);
                i = R.id.iglive_chain_preview_whos_watching_text;
                break;
            case 48:
                return new KCO((UserSession) this.A01);
            case 49:
                Context context = ((C63886LAp) this.A01).A01;
                C57451Iav iav = new C57451Iav(context);
                iav.A05.setText(AnonymousClass7TE.A16(context, 2131954722));
                return iav;
            default:
                return DbY.A0I(this.A01);
        }
        return view.findViewById(i);
    }
}
