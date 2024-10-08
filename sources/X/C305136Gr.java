package X;

import java.util.Arrays;

/* renamed from: X.6Gr  reason: invalid class name and case insensitive filesystem */
public abstract class C305136Gr {
    public static final Object A00(C286575Wy r11, C286015Tp r12, C62320sa r13, Object[] objArr, int i, int i2) {
        Object obj;
        Object obj2;
        Object AJV;
        C286015Tp r7 = r12;
        if ((i2 & 2) != 0) {
            r7 = C45169CrW.A00;
            0qQ.A0C(r7, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        }
        if (0fL.A02()) {
            0fL.A01(-558662283, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:70)");
        }
        boolean z = true;
        String num = Integer.toString(C287425a7.A00(r11), 36);
        0qQ.A07(num);
        0qQ.A0C(r7, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        AnonymousClass5Y2 r6 = (AnonymousClass5Y2) C286615Xc.A01(AnonymousClass5YX.A00, C286565Wx.A04((C286565Wx) r11));
        Object ECw = r11.ECw();
        Object obj3 = AnonymousClass5XT.A00;
        Object[] objArr2 = objArr;
        if (ECw == obj3) {
            if (r6 == null || (AJV = r6.AJV(num)) == null || (obj2 = r7.EIl(AJV)) == null) {
                obj2 = r13.invoke();
            }
            ECw = new AnonymousClass6HJ(r6, r7, obj2, num, objArr2);
            r11.FLL(ECw);
        }
        AnonymousClass6HJ r5 = (AnonymousClass6HJ) ECw;
        if (!Arrays.equals(objArr, r5.A05) || (obj = r5.A03) == null) {
            obj = r13.invoke();
        }
        boolean AGw = r11.AGw(r5);
        if ((((i & 112) ^ 48) <= 32 || !r11.AGw(r7)) && (i & 48) != 32) {
            z = false;
        }
        boolean AGw2 = AGw | z | r11.AGw(r6) | r11.AGu(num) | r11.AGw(obj) | r11.AGw(objArr);
        Object ECw2 = r11.ECw();
        if (AGw2 || ECw2 == obj3) {
            ECw2 = new C41568Awa(r5, r6, r7, obj, num, objArr2);
            r11.FLL(ECw2);
        }
        C286645Xf.A05(r11, (C62320sa) ECw2);
        if (0fL.A02()) {
            0fL.A00(-922537134);
        }
        return obj;
    }
}
