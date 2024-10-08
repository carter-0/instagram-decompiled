package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.ComponentsSystrace;
import com.facebook.litho.LithoView;
import java.util.List;

/* renamed from: X.7hg  reason: invalid class name and case insensitive filesystem */
public final class C338267hg extends 2Rw {
    public final /* synthetic */ 2We A00;

    public C338267hg(2We r2) {
        this.A00 = r2;
        setHasStableIds(r2.A0V.hasStableIds());
    }

    /* JADX WARNING: type inference failed for: r1v19, types: [X.2T3, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r18, int i) {
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        C338557i9 r10 = (C338557i9) r18;
        2We r5 = this.A00;
        int i7 = i;
        int i8 = i7;
        if (r5.A0o) {
            i8 = i % r5.A0i.size();
        }
        C295015nP r3 = (C295015nP) r5.A0i.get(i8);
        C338367hq A02 = r3.A02();
        if (A02.EFF()) {
            LithoView A002 = r10.A00();
            int A01 = 2We.A01(r5.A0A, r3, r5, r5.A06);
            int A003 = 2We.A00(r5.A0A, r3, r5, r5.A05);
            if (!r3.A0A(A01, A003)) {
                if (!(!2Sa.computeRangeOnSyncLayout || (i5 = r5.A01) == -1 || (i6 = r5.A02) == -1)) {
                    int i9 = i6 - i5;
                    if (i7 > i6) {
                        2We.A0P(r5, C338287hi.A01, i7, i9 + i);
                    } else if (i7 < i5) {
                        2We.A0P(r5, C338287hi.A00, i - i9, i7);
                    }
                }
                r3.A07(r5.A0R, new Object(), A01, A003);
            }
            boolean z = false;
            if (r5.A0T.Bq5() == 1) {
                z = true;
            }
            if (View.MeasureSpec.getMode(A01) == 1073741824) {
                i3 = View.MeasureSpec.getSize(A01);
            } else {
                i3 = -2;
                if (z) {
                    i3 = -1;
                }
            }
            if (View.MeasureSpec.getMode(A003) == 1073741824) {
                i4 = View.MeasureSpec.getSize(A003);
            } else {
                i4 = -1;
                if (z) {
                    i4 = -2;
                }
            }
            r10.A01(A002, i3, i4, A01, A003, A02.CU5());
            A002.setComponentTree(r3.A01());
            if (r3.A02().Blf() != null && r3.A0D.get() == 0) {
                A002.A02 = new AnonymousClass9OH(A002, this, r10);
            }
            r5.A0V.CyA(r3.A01(), r10, A02, i8);
            if (r5.A0p) {
                ComponentTree A012 = r3.A01();
                Rect rect = 2We.A19;
                0qQ.A0B(A012, 0);
                LithoView lithoView = A012.A08;
                if (lithoView != null) {
                    lithoView.A0b(rect, false);
                }
            }
        } else if (r10 instanceof C337457gN) {
            C337457gN r102 = (C337457gN) r10;
            int i10 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            if (!r102.A01) {
                A7K CEe = A02.CEe();
                r102.A00 = CEe;
                View view = r102.itemView;
                0qQ.A0B(view, 0);
                C320876t6 r4 = CEe.A04;
                int Ewi = AnonymousClass2Ro.A00.Ewi(r4.A02().ordinal());
                Object tag = view.getTag();
                0qQ.A0C(tag, "null cannot be cast to non-null type H of instagram.features.clips.viewer.adapter.ClipsItemLithoViewBinder");
                C232232tF r32 = CEe.A01;
                r32.bind(r4, (C249703kE) tag);
                AnonymousClass0mX r2 = AnonymousClass0mX.A00;
                2We r0 = CEe.A03.A00.A00;
                if (r0 != null) {
                    i2 = r0.getItemCount();
                } else {
                    i2 = 0;
                }
                r2.A01(view, i2, CEe.A00);
                String name = r32.getClass().getName();
                0qQ.A07(name);
                AnonymousClass2Ro.A00.ASI(C320866t5.A00(r32, r4, name, false, false), Ewi);
                if (182.A06(0Tu.A05, CEe.A02, 36312874750772566L)) {
                    C267324bN r42 = r4.A00;
                    0f9 AEf = 0wj.A01.AEf("ClipsItemLithoViewBinder", 817904698);
                    AEf.ABQ("ClipsItemType", r42.A01.name());
                    1iA r02 = r42.A0J;
                    String str2 = "N/A";
                    if (r02 == null || (str = r02.name()) == null) {
                        str = str2;
                    }
                    AEf.ABQ("MediaType", str);
                    1Xj r03 = r42.A02;
                    if (r03 != null) {
                        str2 = r03.BpP();
                    }
                    AEf.ABQ("MediaId", str2);
                    AEf.ABQ("ClipsItemSource", AnonymousClass9OK.A00(r42.A03));
                    AEf.report();
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        String canonicalName;
        2We r1 = this.A00;
        C338547i8 r4 = (C338547i8) r1.A0X.A02.get(i);
        if (r4 == null) {
            return r1.A0V.D73(viewGroup, i);
        }
        if (viewGroup != null) {
            AnonymousClass0mX.A00(viewGroup);
            int Ewo = AnonymousClass2Ro.A00.Ewo(r4.A02.A02().ordinal());
            GBR gbr = r4.A01;
            C249703kE createViewHolder = gbr.createViewHolder(viewGroup, r4.A00);
            createViewHolder.itemView.setTag(createViewHolder);
            String name = gbr.getClass().getName();
            0qQ.A07(name);
            AnonymousClass2Ro.A00.ASL(C320866t5.A00(gbr, (Object) null, name, false, false), Ewo);
            View view = createViewHolder.itemView;
            0qQ.A06(view);
            try {
                return new C337457gN(view, false);
            } catch (IllegalArgumentException e) {
                Class<?> cls = r4.getClass();
                Class<?> enclosingClass = cls.getEnclosingClass();
                if (enclosingClass == null) {
                    canonicalName = cls.getCanonicalName();
                } else {
                    canonicalName = enclosingClass.getCanonicalName();
                }
                throw new IllegalArgumentException(002.A0R("createView() may not return null from :", canonicalName), e);
            }
        } else {
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final /* bridge */ /* synthetic */ void onViewRecycled(C249703kE r6) {
        A7K a7k;
        C338557i9 r62 = (C338557i9) r6;
        boolean isTracing = ComponentsSystrace.A00.isTracing();
        if (isTracing) {
            ComponentsSystrace.A02("RecyclerBinder.InternalAdapter#onViewRecycledInternal");
        }
        LithoView A002 = r62.A00();
        if (A002 != null) {
            this.A00.A0V.DzF(r62);
            A002.A0W();
            A002.setComponentTree((ComponentTree) null);
        } else if (r62 instanceof C337457gN) {
            C337457gN r63 = (C337457gN) r62;
            if (!r63.A01 && (a7k = r63.A00) != null) {
                View view = r63.itemView;
                0qQ.A0B(view, 0);
                Object tag = view.getTag();
                0qQ.A0C(tag, "null cannot be cast to non-null type H of instagram.features.clips.viewer.adapter.ClipsItemLithoViewBinder");
                a7k.A01.unbind((C249703kE) tag);
                r63.A00 = null;
            }
        }
        if (isTracing) {
            ComponentsSystrace.A01();
        }
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-262077616);
        2We r2 = this.A00;
        int size = r2.A0i.size();
        if (r2.A0o && size > 0) {
            size = Integer.MAX_VALUE;
        }
        AnonymousClass0fD.A0A(1274636959, A03);
        return size;
    }

    public final long getItemId(int i) {
        long itemId;
        int A03 = AnonymousClass0fD.A03(-1992329452);
        2We r1 = this.A00;
        if (r1.A0l) {
            itemId = r1.A0V.getItemId(i);
        } else {
            itemId = C338267hg.super.getItemId(i);
        }
        AnonymousClass0fD.A0A(712963406, A03);
        return itemId;
    }

    public final int getItemViewType(int i) {
        int CEq;
        int i2;
        int A03 = AnonymousClass0fD.A03(101518395);
        2We r2 = this.A00;
        List list = r2.A0i;
        if (r2.A0o) {
            i %= list.size();
        }
        C338367hq A02 = ((C295015nP) list.get(i)).A02();
        if (A02.EFF()) {
            CEq = r2.A0X.A01;
            i2 = 410368958;
        } else {
            CEq = A02.CEq();
            i2 = 1302438175;
        }
        AnonymousClass0fD.A0A(i2, A03);
        return CEq;
    }
}
