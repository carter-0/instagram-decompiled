package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: X.2u0  reason: invalid class name */
public final class AnonymousClass2u0 extends C249383je {
    public static final Set A05 = 0sc.A07(new C231592rv[]{C231592rv.LITHO_MEDIA_BLOKS_BANNER, C231592rv.LITHO_SOCIAL_CONTEXT_BUBBLES, C231592rv.LITHO_COALESCED_HEADER, C231592rv.LITHO_COALESCED_FOOTER, C231592rv.LITHO_COALESCED_MEDIA, C231592rv.LITHO_MEDIA_HEADER, C231592rv.LITHO_MEDIA_UFI, C231592rv.LITHO_MEDIA_CONTENT, C231592rv.LITHO_FULL_HEIGHT_SINGLE_MEDIA_CLIPS_UI, C231592rv.LITHO_OPEN_CAROUSEL_REVIEW_MEDIA_CTA_ROW, C231592rv.LITHO_AD_CTA});
    public RecyclerView A00;
    public final C232642u8 A01;
    public final C232632u7 A02;
    public final boolean A03;
    public final C232612u4 A04 = new C232602u3(this);

    public static final void A00(View view) {
        if (view instanceof 2UA) {
            2UA r0 = (2UA) view;
            r0.Dv5();
            r0.setRenderTreeUpdateListener((C232612u4) null);
        }
        if (view instanceof LithoView) {
            ((LithoView) view).A0k((ComponentTree) null, true);
        }
    }

    public final void A01(View view) {
        Long l;
        if (view instanceof 2UA) {
            2UA r3 = (2UA) view;
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                l = Long.valueOf(recyclerView.getDrawingTime());
            } else {
                l = null;
            }
            r3.Dct(l);
            r3.setRenderTreeUpdateListener(this.A04);
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.2u5, java.lang.Object] */
    public AnonymousClass2u0(C231502rm r10, AnonymousClass2u2 r11) {
        this.A03 = r10.A0T;
        int intValue = ((Number) r10.A06.getValue()).intValue();
        UserSession userSession = r10.A02;
        0Tu r2 = 0Tu.A05;
        this.A02 = new C232632u7(new AnonymousClass9I7(182.A06(r2, userSession, 36317225551860625L), intValue, (int) 182.A01(r2, userSession, 36598700524965115L), (int) 182.A01(r2, userSession, 36598700525030652L), 1), new Object(), new AnonymousClass2u6(r11));
        this.A01 = new C232642u8(this);
    }

    public final void onScroll(C238133Ar r12, int i, int i2, int i3, int i4, int i5) {
        Integer valueOf;
        Integer valueOf2;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int A032 = AnonymousClass0fD.A03(-652272682);
        C232632u7 r3 = this.A02;
        int i10 = (i2 + i) - 1;
        if (!(i == r3.A00 && i10 == r3.A01)) {
            r3.A00 = i;
            r3.A01 = i10;
            int Cf7 = r3.A09.Cf7();
            if (r3.A0C) {
                int i11 = Cf7;
                TreeMap treeMap = r3.A0B;
                Map.Entry floorEntry = treeMap.floorEntry(Integer.valueOf(i));
                int[] iArr4 = null;
                if (floorEntry != null) {
                    iArr4 = (int[]) floorEntry.getValue();
                }
                int i12 = 0;
                if (iArr4 != null) {
                    i6 = iArr4[0];
                } else {
                    i6 = 0;
                }
                Map.Entry floorEntry2 = treeMap.floorEntry(Integer.valueOf(i6 - 1));
                if (floorEntry2 == null || (iArr3 = (int[]) floorEntry2.getValue()) == null) {
                    i7 = 0;
                } else {
                    i7 = iArr3[0];
                }
                Map.Entry floorEntry3 = treeMap.floorEntry(Integer.valueOf(i10));
                if (floorEntry3 == null || (iArr2 = (int[]) floorEntry3.getValue()) == null) {
                    i8 = 0;
                    i9 = 0;
                } else {
                    i8 = iArr2[0];
                    i9 = iArr2[1];
                }
                Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i8 + i9));
                if (!(ceilingEntry == null || (iArr = (int[]) ceilingEntry.getValue()) == null)) {
                    i11 = iArr[0];
                    i12 = iArr[1];
                }
                valueOf = Integer.valueOf(i7);
                valueOf2 = Integer.valueOf((i11 + i12) - 1);
            } else {
                valueOf = Integer.valueOf(i - r3.A07);
                valueOf2 = Integer.valueOf(i10 + r3.A08);
            }
            0eP r2 = new 0eP(valueOf, valueOf2);
            int max = Math.max(0, ((Number) r2.A00).intValue());
            int intValue = ((Number) r2.A01).intValue();
            r3.A05 = intValue;
            int min = Math.min(Cf7 - 1, intValue);
            int i13 = r3.A03;
            if (!(max == i13 && min == r3.A02)) {
                int i14 = r3.A02;
                r3.A03 = max;
                r3.A02 = min;
                int i15 = r3.A06;
                if (min > i15) {
                    2HY r0 = new 2HY(i13, i14);
                    2HY r22 = new 2HY(max, min);
                    Set A0l = 00k.A0l(r0, r22);
                    Set A0j = 00k.A0j(r0);
                    018.A16(r22, A0j);
                    List A0a = 00k.A0a(094.A02(A0l, A0j));
                    ArrayList<Number> arrayList = new ArrayList<>();
                    for (Object next : A0a) {
                        int intValue2 = ((Number) next).intValue();
                        if (intValue2 >= 0 && intValue2 < Cf7) {
                            arrayList.add(next);
                        }
                    }
                    for (Number intValue3 : arrayList) {
                        int intValue4 = intValue3.intValue();
                        C376479Id r23 = (C376479Id) r3.A0A.get(Integer.valueOf(intValue4));
                        if (r23 != null) {
                            int i16 = r3.A03;
                            if ((intValue4 > r3.A02 || i16 > intValue4) && intValue4 >= i15) {
                                r23.A00();
                            } else {
                                r23.A01(AnonymousClass05K.A00);
                            }
                        }
                    }
                }
            }
        }
        AnonymousClass0fD.A0A(-508360949, A032);
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        AnonymousClass0fD.A0A(-702106676, AnonymousClass0fD.A03(-1906978500));
    }
}
