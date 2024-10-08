package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: X.SdS  reason: case insensitive filesystem */
public final class C11624SdS implements AnonymousClass0hF, AnonymousClass07Y {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C11624SdS(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void Dms(07T r11, AnonymousClass07Z r12) {
        AnonymousClass07V lifecycle;
        ViewGroup viewGroup;
        String str;
        switch (this.A00) {
            case 0:
                Object obj = this.A01;
                C270284gU r0 = (C270284gU) this.A02;
                if (r11 == obj) {
                    DbS.A1U(r0.getValue());
                    return;
                }
                return;
            case 1:
                C14191TrW trW = (C14191TrW) this.A01;
                if (!trW.A07.A12()) {
                    r12.getLifecycle().A0A(this);
                    UB4 ub4 = (UB4) this.A02;
                    if (ub4.itemView.isAttachedToWindow()) {
                        trW.A05(ub4);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (DbU.A02(r11, 1) == 5) {
                    C55862Hoj hoj = (C55862Hoj) this.A02;
                    View view = (View) this.A01;
                    ViewParent parent = view.getParent();
                    if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                        viewGroup.removeView(view);
                    }
                    lifecycle = hoj.A03.getLifecycle();
                    break;
                } else {
                    return;
                }
            default:
                boolean A1Z = AnonymousClass7TG.A1Z(r12, r11);
                if (r11 == 07T.ON_PAUSE) {
                    RRA rra = (RRA) this.A02;
                    rra.A00 = System.currentTimeMillis();
                    0wc r4 = rra.A01;
                    if (r4 != null) {
                        1Xj r02 = rra.A02;
                        if (r02 != null) {
                            String C9L = r02.C9L();
                            String str2 = rra.A04;
                            if (str2 != null) {
                                rra.A00(r4, (Double) null, "mai_play_store_launched", C9L, str2);
                                ((0r1) this.A01).A00 = A1Z;
                            }
                            str = "appStoreUri";
                            0qQ.A0F(str);
                            throw AnonymousClass00P.createAndThrow();
                        }
                        str = "media";
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    str = "logger";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                if (r11 == 07T.ON_RESUME && ((0r1) this.A01).A00) {
                    RRA rra2 = (RRA) this.A02;
                    long currentTimeMillis = System.currentTimeMillis() - rra2.A00;
                    0wc r5 = rra2.A01;
                    if (r5 != null) {
                        1Xj r2 = rra2.A02;
                        if (r2 != null) {
                            String C9L2 = r2.C9L();
                            Double valueOf = Double.valueOf((double) currentTimeMillis);
                            String str3 = rra2.A04;
                            if (str3 != null) {
                                rra2.A00(r5, valueOf, "mai_play_store_dismissed", C9L2, str3);
                                lifecycle = r12.getLifecycle();
                                break;
                            }
                            str = "appStoreUri";
                            0qQ.A0F(str);
                            throw AnonymousClass00P.createAndThrow();
                        }
                        str = "media";
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    str = "logger";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                return;
        }
        lifecycle.A0A(this);
    }
}
