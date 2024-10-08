package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.instagram.android.R;

public final class H02 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "InstagramConsentFlowBottomSheetFragment";
    public C17317VQw A00;
    public C53250Gky A01;
    public C55702Hlz A02;
    public C307786Rm A03;
    public String A04;
    public final AnonymousClass0eM A05 = C227642jf.A01(this);
    public final 2el A06 = 2el.A00();

    public final String getModuleName() {
        return "InstagramConsentFlowBottomSheet";
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r11 != null) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r16) {
        /*
            r15 = this;
            r0 = 1797546670(0x6b2462ae, float:1.9872984E26)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r0 = r16
            X.H02.super.onCreate(r0)
            android.os.Bundle r1 = r15.requireArguments()
            java.lang.String r0 = "prompt_id"
            java.lang.String r1 = r1.getString(r0)
            if (r1 == 0) goto L_0x009d
            r15.A04 = r1
            java.lang.String r5 = "promptId"
            r0 = 0
            java.util.HashMap r3 = X.C56480HzC.A01
            java.lang.Object r1 = r3.get(r1)
            X.Hlz r1 = (X.C55702Hlz) r1
            if (r1 != 0) goto L_0x0092
            java.lang.String r1 = r15.A04
            if (r1 == 0) goto L_0x0095
            X.HSW.A00(r15, r1)
        L_0x002e:
            java.lang.String r1 = r15.A04
            if (r1 == 0) goto L_0x0095
            java.lang.Object r1 = r3.get(r1)
            X.Hlz r1 = (X.C55702Hlz) r1
            if (r1 == 0) goto L_0x0090
            X.4tV r4 = r1.A02
            if (r4 == 0) goto L_0x0044
            java.lang.String r11 = r4.A0F()
            if (r11 != 0) goto L_0x0046
        L_0x0044:
            java.lang.String r11 = "default"
        L_0x0046:
            if (r4 == 0) goto L_0x0088
            java.lang.String r12 = r4.A0H()
            java.lang.String r13 = r4.A0J()
            java.lang.String r14 = r4.A0G()
            X.4uI r8 = r4.A09()
            r1 = 41
            X.4uI r9 = r4.A0A(r1)
            r1 = 40
            X.4uI r10 = r4.A0A(r1)
            r1 = 140(0x8c, float:1.96E-43)
            X.4tV r7 = r4.A07(r1)
        L_0x006a:
            X.Gky r6 = new X.Gky
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r15.A01 = r6
            java.lang.String r1 = r15.A04
            if (r1 == 0) goto L_0x0095
            java.lang.Object r1 = r3.get(r1)
            X.Hlz r1 = (X.C55702Hlz) r1
            if (r1 == 0) goto L_0x007f
            X.6Rm r0 = r1.A00
        L_0x007f:
            r15.A03 = r0
            r0 = -95980808(0xfffffffffa4772f8, float:-2.5889973E35)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x0088:
            r12 = r0
            r13 = r0
            r14 = r0
            r8 = r0
            r9 = r0
            r10 = r0
            r7 = r0
            goto L_0x006a
        L_0x0090:
            r4 = r0
            goto L_0x0044
        L_0x0092:
            r15.A02 = r1
            goto L_0x002e
        L_0x0095:
            X.0qQ.A0F(r5)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x009d:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -901552072(0xffffffffca436838, float:-3201550.0)
            X.AnonymousClass0fD.A09(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H02.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.1Ko, java.lang.Object] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        0rm A11;
        C60074Jf7 A002;
        int i;
        View onCreateView;
        int i2;
        int A022 = AnonymousClass0fD.A02(-1206233139);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater2, 0);
        ViewGroup viewGroup2 = viewGroup;
        Bundle bundle2 = bundle;
        if (this.A02 == null) {
            onCreateView = H02.super.onCreateView(layoutInflater2, viewGroup2, bundle2);
            i2 = -703581006;
        } else {
            Context requireContext = requireContext();
            0lg A0X = DbT.A0X(this.A05);
            2el r0 = this.A06;
            2el r25 = r0;
            C229382nI A032 = C229382nI.A03(this, A0X, r0);
            boolean A003 = AnonymousClass3HA.A00(requireContext);
            C53250Gky gky = this.A01;
            String str = "options";
            if (gky != null) {
                C276544tV r1 = gky.A00;
                int color = requireContext.getColor(R.color.direct_widget_primary_background);
                if (r1 != null) {
                    int i3 = 36;
                    if (A003) {
                        i3 = 35;
                    }
                    String A0K = r1.A0K(i3);
                    if (A0K != null) {
                        color = AnonymousClass6Su.A03(A0K);
                    }
                }
                C55702Hlz hlz = this.A02;
                if (hlz == null) {
                    str = "promptDisplayParameter";
                } else {
                    C3034368u r6 = hlz.A01;
                    if (r6 != null) {
                        ? obj = new Object();
                        C53250Gky gky2 = this.A01;
                        if (gky2 != null) {
                            C307786Rm r24 = this.A03;
                            C361838gt C5w = obj.C5w();
                            getSession();
                            0sP myk = new MYK("InstagramConsentFlowBottomSheet", 5);
                            0qQ.A0B(C5w, 8);
                            boolean A0K2 = 0qQ.A0K(gky2.A07, "cds");
                            String str2 = gky2.A06;
                            String str3 = gky2.A05;
                            String str4 = gky2.A04;
                            C277014uI r23 = gky2.A03;
                            C277014uI r22 = gky2.A01;
                            C277014uI r21 = gky2.A02;
                            if (A0K2) {
                                Context requireContext2 = requireContext();
                                int A004 = C14560TyP.A00(A003, true);
                                GradientDrawable gradientDrawable = new GradientDrawable();
                                gradientDrawable.setColor(A004);
                                float A005 = C18183Vmx.A00(requireContext2, (float) 1Kq.A04(AnonymousClass05K.A0C));
                                float[] fArr = new float[8];
                                fArr[0] = A005;
                                fArr[1] = A005;
                                fArr[2] = A005;
                                fArr[3] = A005;
                                fArr[4] = 0.0f;
                                C51975G9x.A1L(fArr, 0.0f);
                                gradientDrawable.setCornerRadii(fArr);
                                StringBuilder A1A = AnonymousClass7TE.A1A();
                                A1A.append(A005);
                                C14560TyP A006 = C48305EcO.A00(requireContext2, C5w, AnonymousClass7TF.A0l("px", A1A), A003);
                                A11 = C51965G9l.A11();
                                FragmentActivity requireActivity = requireActivity();
                                TY5 ty5 = new TY5(A11, 46);
                                2V1 r02 = new 2V1(requireActivity);
                                int A007 = V6C.A00(str3, 0);
                                int A008 = V6C.A00(str4, Integer.MAX_VALUE);
                                GOI A009 = GOJ.A00(r02);
                                A009.A03();
                                A009.A04(C51965G9l.A0D(0));
                                GOI A0010 = GOJ.A00(r02);
                                A0010.A00.A0Z().A0O(C243573Zh.CENTER);
                                C53617GrW A0011 = GY5.A00(r02);
                                C251253mo r16 = A0011.A00;
                                r16.A0Z().A0J(A007);
                                r16.A0Z().A0H(A008);
                                A0011.A0B(r6);
                                A0011.A01.A03 = new INH(ty5, 1);
                                A0011.A0C(A032);
                                A0010.A0A(A0011.A0A());
                                A009.A0A(A0010.A00);
                                AnonymousClass3X6 A023 = ComponentTree.A02(A009.A00, new 2V1(requireActivity), (AnonymousClass2TL) null);
                                A023.A07 = false;
                                ComponentTree A0012 = A023.A00();
                                LithoView lithoView = new LithoView(new 2V1(requireActivity), (AttributeSet) null);
                                lithoView.A0k(A0012, true);
                                0qQ.A0A(lithoView);
                                A002 = new C60074Jf7(requireActivity, lithoView, A006);
                                if (str2 != null) {
                                    int A0013 = V6C.A00(str2, 0);
                                    A009.A00.A0Z().A0F(A0013);
                                    A002.setMaxHeight(A0013);
                                    A002.setMinHeight(A0013);
                                } else {
                                    A002.setMaxHeight(A008);
                                    A002.setMinHeight(A007);
                                }
                                A002.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                A002.setBackground(gradientDrawable);
                                i = 12;
                            } else {
                                A11 = C51965G9l.A11();
                                GradientDrawable gradientDrawable2 = new GradientDrawable();
                                gradientDrawable2.setColor(color);
                                float A0014 = C18183Vmx.A00(requireActivity(), 16.0f);
                                float[] fArr2 = new float[8];
                                fArr2[0] = A0014;
                                fArr2[1] = A0014;
                                fArr2[2] = A0014;
                                fArr2[3] = A0014;
                                fArr2[4] = 0.0f;
                                C51975G9x.A1L(fArr2, 0.0f);
                                gradientDrawable2.setCornerRadii(fArr2);
                                FragmentActivity requireActivity2 = requireActivity();
                                TY5 ty52 = new TY5(A11, 47);
                                2V1 r15 = new 2V1(requireActivity2);
                                int A0015 = V6C.A00(str3, 0);
                                int A0016 = V6C.A00(str4, Integer.MAX_VALUE);
                                GOI A0017 = GOJ.A00(r15);
                                if (str2 != null) {
                                    A0017.A00.A0Z().A0F(V6C.A00(str2, 0));
                                }
                                A0017.A03();
                                A0017.A04(C51965G9l.A0D(0));
                                GOI A0018 = GOJ.A00(r15);
                                A0018.A00.A0Z().A0O(C243573Zh.CENTER);
                                C53617GrW A0019 = GY5.A00(r15);
                                C251253mo r12 = A0019.A00;
                                r12.A0Z().A0J(A0015);
                                r12.A0Z().A0H(A0016);
                                A0019.A0B(r6);
                                A0019.A04(gradientDrawable2);
                                A0019.A01.A03 = new INH(ty52, 0);
                                A0019.A0C(A032);
                                A0018.A0A(A0019.A0A());
                                A0017.A0A(A0018.A00);
                                A002 = LithoView.A00(requireActivity2, A0017.A00);
                                i = 13;
                            }
                            this.A00 = new C17317VQw(A002, this, r6, r23, r21, r22, str2, new C13349TVw(i, A11, r24), myk);
                            AnonymousClass3DZ A0020 = AnonymousClass3DZ.A00(this);
                            C17317VQw vQw = this.A00;
                            if (vQw == null) {
                                str = "bottomSheetDialogDelegate";
                            } else {
                                r25.A08(vQw.A00, A0020, new AnonymousClass2eo[0]);
                                onCreateView = H02.super.onCreateView(layoutInflater2, viewGroup2, bundle2);
                                i2 = 1747260242;
                            }
                        }
                    } else {
                        IllegalStateException A0y = AnonymousClass7TE.A0y();
                        AnonymousClass0fD.A09(1807193283, A022);
                        throw A0y;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A09(i2, A022);
        return onCreateView;
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1494554114);
        H02.super.onStart();
        C17317VQw vQw = this.A00;
        if (vQw != null) {
            AnonymousClass0fN.A00(vQw.A01);
        }
        AnonymousClass0fD.A09(2046992789, A022);
    }

    public final void onStop() {
        FragmentActivity activity;
        int A022 = AnonymousClass0fD.A02(1135384529);
        if (this.mRemoving && this.A00 != null && (activity = getActivity()) != null && !activity.isDestroyed()) {
            C17317VQw vQw = this.A00;
            if (vQw == null) {
                0qQ.A0F("bottomSheetDialogDelegate");
                throw AnonymousClass00P.createAndThrow();
            }
            2Tb r1 = vQw.A01;
            if (r1.isShowing()) {
                r1.dismiss();
            }
        }
        H02.super.onStop();
        AnonymousClass0fD.A09(-1475298003, A022);
    }
}
