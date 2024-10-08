package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.litho.LithoView;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public final class HC8 extends C249383je {
    public final int A00;
    public final Object A01;

    public HC8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onScroll(C238133Ar r14, int i, int i2, int i3, int i4, int i5) {
        int A03;
        int i6;
        1Xj A04;
        int position;
        2dZ A032;
        String str;
        String str2;
        AnonymousClass2Ep r1;
        View.OnClickListener wb9;
        boolean z;
        int i7;
        String string;
        C238133Ar r7 = r14;
        int i8 = i;
        int i9 = i2;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(-1876737694);
                0qQ.A0B(r14, 0);
                View AnC = r14.AnC(i2 - 1);
                if (AnC != null) {
                    WeakReference weakReference = C55387Hgt.A01;
                    if (weakReference.get() == null && ((AnC instanceof AnonymousClass3TP) || (AnC instanceof LithoView))) {
                        weakReference = C51965G9l.A0v(AnC);
                        C55387Hgt.A01 = weakReference;
                    }
                    if (weakReference.get() != null && AnC.equals(weakReference.get())) {
                        int height = AnC.getHeight();
                        Rect rect = new Rect(0, 0, 0, 0);
                        AnC.getGlobalVisibleRect(rect);
                        int i10 = height - (rect.bottom - rect.top);
                        Context context = r14.getContext();
                        0qQ.A07(context);
                        ((C55472HiG) this.A01).A00.A01(Float.valueOf(0nA.A01(context, (float) i10)));
                    }
                    i6 = -1509820900;
                    break;
                } else {
                    i6 = -455417659;
                    break;
                }
            case 1:
                A03 = AnonymousClass7TG.A0D(r14, 329599905);
                C52477GUf gUf = (C52477GUf) this.A01;
                GMC gmc = gUf.A0B;
                if (gmc != null && gUf.A0Q) {
                    gmc.A03(C52477GUf.A03(gUf));
                }
                if (i < i9 && gUf.A0K != null) {
                    if (i == 0) {
                        A032 = 2dZ.A0t.A03(gUf.requireActivity());
                        str = gUf.A0H;
                    } else if (gUf.A01 == 0) {
                        A032 = 2dZ.A0t.A03(gUf.requireActivity());
                        str = gUf.A0K;
                    }
                    GMC gmc2 = gUf.A0B;
                    if (gmc2 == null || (r1 = gmc2.A0A) == null) {
                        str2 = null;
                    } else {
                        str2 = r1.C6f();
                    }
                    A032.EfN(str, str2);
                }
                gUf.A01 = i;
                if (!(gUf.A0F == null || (A04 = C231122qu.A04(C51968G9o.A0k(gUf).getItem(i))) == null || (position = C51968G9o.A0k(gUf).BQr(A04).getPosition()) <= gUf.A00)) {
                    Iterator it = C51968G9o.A0k(gUf).A04.iterator();
                    int i11 = 0;
                    while (it.hasNext()) {
                        int A0F = AnonymousClass7TG.A0F(it);
                        if (i < A0F + 1 && (i + i2) - 1 >= A0F) {
                            i11++;
                        }
                    }
                    if (i11 > 0) {
                        position += i11;
                    }
                    C233812wV r2 = gUf.A0F;
                    if (r2 != null) {
                        r2.A0C(position);
                        r2.A0D(position, gUf.A00);
                    }
                    gUf.A00 = position;
                }
                C228312lJ r6 = gUf.A0E;
                if (r6 != null) {
                    r6.onScroll(r7, i8, i9, i3, i4, i5);
                    i6 = -1370617748;
                    break;
                } else {
                    0qQ.A0F("tailLoadLogger");
                    throw AnonymousClass00P.createAndThrow();
                }
                break;
            default:
                A03 = AnonymousClass0fD.A03(500527686);
                C15381Ube ube = (C15381Ube) this.A01;
                if (C15381Ube.A01(ube).A02 != null || C15381Ube.A01(ube).A03 != null) {
                    if (i <= 3) {
                        AnonymousClass357 r22 = ube.A0K;
                        if (r22 != null) {
                            r22.A04(r22.A04);
                        }
                    } else if (ube.mView != null) {
                        if (ube.A0K == null) {
                            C45355Cux cux = C15381Ube.A01(ube).A03;
                            Context requireContext = ube.requireContext();
                            if (cux != null) {
                                string = cux.A01;
                                wb9 = new WBG(39, ube, cux);
                                z = true;
                                i7 = -1;
                            } else {
                                wb9 = new WB9((Object) ube, 34);
                                z = true;
                                i7 = -1;
                                string = requireContext.getString(2131962681);
                            }
                            AnonymousClass357 r4 = new AnonymousClass357(requireContext, wb9, string, i7, z);
                            ube.A0K = r4;
                            View view = ube.mView;
                            0qQ.A0C(view, "null cannot be cast to non-null type android.widget.FrameLayout");
                            r4.A06((FrameLayout) view);
                            AnonymousClass357 r42 = ube.A0K;
                            if (r42 != null) {
                                r42.A02(AnonymousClass1GB.A01(0nA.A04(ube.requireContext(), 60)));
                            }
                            AnonymousClass357 r3 = ube.A0K;
                            if (r3 != null) {
                                r3.A01(81);
                            }
                        }
                        AnonymousClass357 r23 = ube.A0K;
                        if (r23 != null) {
                            r23.A05(r23.A03);
                        }
                    }
                    i6 = -521507153;
                    break;
                } else {
                    i6 = -440585398;
                    break;
                }
                break;
        }
        AnonymousClass0fD.A0A(i6, A03);
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        int A03;
        int i2;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(59644987);
                i2 = -1059621423;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(1624001839);
                i2 = 757416663;
                break;
            default:
                A03 = AnonymousClass0fD.A03(-330091911);
                i2 = -969087203;
                break;
        }
        AnonymousClass0fD.A0A(i2, A03);
    }
}
