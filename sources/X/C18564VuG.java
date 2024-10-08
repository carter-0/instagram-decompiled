package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.HashMap;

/* renamed from: X.VuG  reason: case insensitive filesystem */
public final class C18564VuG {
    public C307996Sh A00;
    public C307996Sh A01;
    public final C55979Hqk A02;
    public final VQU A03;
    public final C307786Rm A04;

    public static Float A00(Context context, int i) {
        return Float.valueOf(C18183Vmx.A01(context, (float) i));
    }

    public final C245663dH A01(View view, C276544tV r43) {
        int i;
        int i2;
        int A042;
        C307996Sh r1;
        C276544tV r7 = r43;
        C276544tV A07 = r7.A07(43);
        if (A07 != null) {
            C276544tV r0 = A07;
            float A002 = C16918VAv.A00(r0, 49);
            float A003 = C16918VAv.A00(r0, 43);
            View view2 = view;
            Resources resources = view2.getResources();
            C307786Rm r12 = this.A04;
            C307786Rm r38 = r12;
            Context context = r12.A00;
            Context context2 = context;
            float min = Math.min(((float) resources.getDisplayMetrics().widthPixels) * 0.8f, C18183Vmx.A00(context, 300.0f));
            if (A002 == 0.0f) {
                i = (int) min;
                int i3 = AnonymousClass3XX.A00;
                i2 = AnonymousClass972.MUTABLE_FLAG_MASK;
            } else {
                i = (int) A002;
                int i4 = AnonymousClass3XX.A00;
                i2 = SN3.MAX_SIGNED_POWER_OF_TWO;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, i2);
            if (A003 == 0.0f) {
                A042 = AnonymousClass3XX.A00;
            } else {
                A042 = C13988Tno.A04((int) A003);
            }
            C55979Hqk hqk = this.A02;
            hqk.A00 = null;
            C308006Si r35 = C307996Sh.A04;
            C307996Sh A032 = r35.A03(r35.A01(context2, this.A01, r38, (C245603dB[]) null, -1), A07, (Object) null, C244873bt.A00(makeMeasureSpec, A042));
            this.A01 = A032;
            C245663dH r13 = A032.A01;
            int A012 = r13.A01();
            int A004 = r13.A00();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            C18056Vke vke = new C18056Vke(displayMetrics.widthPixels, displayMetrics.heightPixels, iArr[0], iArr[1], view2.getWidth(), view2.getHeight(), A012, A004, C16919VAw.A00(AnonymousClass7TE.A0S(view2)));
            VQU vqu = this.A03;
            HashMap hashMap = vqu.A01;
            HashMap hashMap2 = hashMap;
            C18046VkU vkU = (C18046VkU) hashMap.get(vke);
            if (vkU == null) {
                C277014uI A0A = r7.A0A(40);
                if (A0A != null) {
                    C307786Rm r122 = vqu.A00;
                    Context context3 = r122.A00;
                    C308276Tl r11 = new C308276Tl();
                    r11.A03(A00(context3, vke.A05), 0);
                    r11.A03(A00(context3, vke.A04), 1);
                    r11.A03(A00(context3, vke.A02), 2);
                    r11.A03(A00(context3, vke.A03), 3);
                    r11.A03(A00(context3, vke.A01), 4);
                    r11.A03(A00(context3, vke.A00), 5);
                    r11.A03(A00(context3, vke.A07), 6);
                    r11.A03(A00(context3, vke.A06), 7);
                    r11.A03(Boolean.valueOf(vke.A08), 8);
                    Object A005 = C299275ur.A00(C307896Rx.A01(r122, A0A, r7.A09), r11.A00(), A0A);
                    0qQ.A07(A005);
                    C276544tV r4 = (C276544tV) A005;
                    0qQ.A0B(r4, 0);
                    float A022 = r4.A02(43, 0.0f);
                    float A023 = r4.A02(44, 0.0f);
                    float A024 = r4.A02(42, 0.0f);
                    float A025 = r4.A02(41, 0.0f);
                    float A026 = r4.A02(38, 0.0f);
                    float A027 = r4.A02(40, 0.0f);
                    float A028 = r4.A02(48, 0.0f);
                    float A029 = r4.A02(46, 0.0f);
                    float A0210 = r4.A02(55, 0.0f);
                    float A0211 = r4.A02(56, 0.0f);
                    float A0212 = r4.A02(54, 0.0f);
                    float A0213 = r4.A02(53, 0.0f);
                    String A0K = r4.A0K(45);
                    for (C16545Uws uws : C16545Uws.values()) {
                        if (0qQ.A0K(uws.A00, A0K)) {
                            String A0F = r4.A0F();
                            C16564UxH[] values = C16564UxH.values();
                            int length = values.length;
                            int i5 = 0;
                            while (i5 < length) {
                                C16564UxH uxH = values[i5];
                                if (0qQ.A0K(uxH.A00, A0F)) {
                                    vkU = new C18046VkU(new RectF(C18183Vmx.A00(context3, A022), C18183Vmx.A00(context3, A023), C18183Vmx.A00(context3, A022 + A024), C18183Vmx.A00(context3, A023 + A025)), new RectF(C18183Vmx.A00(context3, A0210), C18183Vmx.A00(context3, A0211), C18183Vmx.A00(context3, A0210 + A0212), C18183Vmx.A00(context3, A0211 + A0213)), new RectF(C18183Vmx.A00(context3, A026), C18183Vmx.A00(context3, A027), C18183Vmx.A00(context3, A026 + A028), C18183Vmx.A00(context3, A027 + A029)), uxH, uws);
                                    hashMap2.put(vke, vkU);
                                } else {
                                    i5++;
                                }
                            }
                            throw DbU.A0h();
                        }
                    }
                    throw DbU.A0h();
                }
                throw new IllegalArgumentException("Server should have ensured that the Tooltip Container always has on-compute-position.");
            }
            if (0qQ.A0K(hqk.A00, vkU)) {
                r1 = this.A00;
                if (r1 == null) {
                    return null;
                }
            } else {
                hqk.A00 = vkU;
                C244943c0 A013 = r35.A01(context2, this.A00, r38, (C245603dB[]) null, -1);
                RectF rectF = vkU.A02;
                int width = (int) rectF.width();
                int height = (int) rectF.height();
                r1 = r35.A03(A013, A07, (Object) null, C244913bx.A00.A00(width, width, height, height));
                this.A00 = r1;
            }
            return r1.A01;
        }
        throw new IllegalArgumentException("Server should have ensured that the Tooltip Container always has a Tooltip.");
    }

    public C18564VuG(C55979Hqk hqk, C307786Rm r3) {
        this.A04 = r3;
        this.A02 = hqk;
        this.A03 = new VQU(r3);
    }
}
