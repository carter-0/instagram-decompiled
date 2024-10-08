package X;

import android.widget.ListAdapter;
import com.instagram.save.model.SavedCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.H3x  reason: case insensitive filesystem */
public final class C54228H3x extends 2Ru implements C231272rL, C231302rO, ListAdapter {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final C54367HAi A04 = new AnonymousClass2rW();
    public final boolean A05;
    public final AnonymousClass2s2 A06;
    public final C231802sQ A07;
    public final H46 A08;
    public final H42 A09;
    public final AnonymousClass71T A0A;
    public final C229122ms A0B;
    public final C231762sK A0C;
    public final boolean A0D;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: X.2s0[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: X.2s0[]} */
    /* JADX WARNING: type inference failed for: r4v0, types: [X.2s2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.H46] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.HAi, X.2rW] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C54228H3x(android.content.Context r23, X.AnonymousClass0iw r24, com.instagram.common.session.UserSession r25, X.C55786HnL r26, X.C54177H1x r27, X.C229122ms r28, java.lang.String r29, boolean r30, boolean r31) {
        /*
            r22 = this;
            r13 = 1
            r5 = 2
            r10 = r25
            X.0qQ.A0B(r10, r5)
            r12 = 3
            r7 = 4
            r6 = r22
            r6.<init>()
            r8 = r30
            r6.A0D = r8
            r0 = r28
            r6.A0B = r0
            r0 = r31
            r6.A05 = r0
            X.2s2 r4 = new X.2s2
            r4.<init>()
            r6.A06 = r4
            X.2sK r3 = new X.2sK
            r15 = r23
            r3.<init>(r15)
            r6.A0C = r3
            X.H42 r14 = new X.H42
            r16 = r24
            r18 = r26
            r19 = r27
            r20 = r8
            r21 = r0
            r17 = r10
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r6.A09 = r14
            X.H46 r2 = new X.H46
            r2.<init>()
            r6.A08 = r2
            X.HAi r0 = new X.HAi
            r0.<init>()
            r6.A04 = r0
            X.ITD r0 = new X.ITD
            r0.<init>(r10, r6)
            r6.A07 = r0
            X.71T r1 = new X.71T
            r1.<init>(r15)
            r6.A0A = r1
            r11 = 0
            r9 = r29
            if (r29 == 0) goto L_0x007d
            boolean r0 = X.I31.A01(r10)
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = r10.A06
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x007a
        L_0x006c:
            boolean r0 = X.I31.A00(r10)
            if (r0 == 0) goto L_0x0098
            java.lang.String r0 = r10.A06
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0098
        L_0x007a:
            r0 = 1
        L_0x007b:
            r6.A03 = r0
        L_0x007d:
            if (r30 == 0) goto L_0x0091
            boolean r0 = r6.A03
            if (r0 != 0) goto L_0x0091
            X.2s0[] r0 = new X.C231642s0[r7]
            r0[r11] = r14
            r0[r13] = r2
        L_0x0089:
            r0[r5] = r1
            r0[r12] = r3
            r6.init(r0)
            return
        L_0x0091:
            X.2s0[] r0 = new X.C231642s0[r7]
            r0[r11] = r4
            r0[r13] = r14
            goto L_0x0089
        L_0x0098:
            r0 = 0
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54228H3x.<init>(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.HnL, X.H1x, X.2ms, java.lang.String, boolean, boolean):void");
    }

    public static final void A00(C54228H3x h3x) {
        Integer num;
        C54367HAi hAi = h3x.A04;
        hAi.A08(h3x.A07);
        if (!h3x.A02 || hAi.A02() != 0) {
            h3x.A01 = 0;
            h3x.A00 = 0;
            h3x.clear();
            if (!h3x.A0D || h3x.A03) {
                h3x.addModel((Object) null, h3x.A06);
            } else {
                h3x.addModel(hAi, (Object) null, h3x.A08);
            }
            for (int i = 0; i < C51966G9m.A03(hAi); i += 2) {
                C3251571g r4 = new C3251571g(hAi.A01, i, 2);
                if (i == 0) {
                    num = AnonymousClass05K.A01;
                } else if (i + 2 >= C51966G9m.A03(hAi)) {
                    num = AnonymousClass05K.A0C;
                } else {
                    num = AnonymousClass05K.A0N;
                }
                h3x.addModel(r4, new C55652HlB(i, num), h3x.A09);
                int A012 = r4.A01();
                for (int i2 = 0; i2 < A012; i2++) {
                    if (((SavedCollection) r4.A02(i2)).A07 == C54665HMw.MEDIA) {
                        h3x.A01++;
                    }
                    h3x.A00++;
                }
            }
            h3x.addModel(h3x.A0B, h3x.A0C);
        } else {
            C3253572b r2 = new C3253572b();
            r2.A0M = true;
            boolean z = h3x.A0D;
            r2.A0L = !z;
            r2.A0P = z;
            h3x.addModel(r2, C320156rr.LOADING, h3x.A0A);
        }
        h3x.notifyDataSetChanged();
    }

    public final void A01(1Xj r7) {
        C54367HAi hAi = this.A04;
        0qQ.A0B(hAi, 0);
        int A032 = C51966G9m.A03(hAi);
        int i = 0;
        while (true) {
            if (i >= A032) {
                break;
            }
            SavedCollection savedCollection = (SavedCollection) hAi.A01.get(i);
            if (savedCollection.A07 == C54665HMw.ALL_MEDIA_AUTO_COLLECTION) {
                List unmodifiableList = Collections.unmodifiableList(savedCollection.A0L);
                ArrayList A15 = DbV.A15(unmodifiableList);
                A15.add(r7);
                Iterator it = unmodifiableList.iterator();
                while (it.hasNext()) {
                    1Xj A0t = C51966G9m.A0t(it);
                    if (!I6V.A05(r7, A0t)) {
                        A15.add(A0t);
                    }
                }
                savedCollection.A0L = A15;
            } else {
                i++;
            }
        }
        A00(this);
    }

    public final boolean A02(1Xj r6) {
        C54367HAi hAi = this.A04;
        0qQ.A0B(hAi, 0);
        int A032 = C51966G9m.A03(hAi);
        for (int i = 0; i < A032; i++) {
            1Xj r0 = ((SavedCollection) hAi.A01.get(i)).A04;
            if (r0 != null && I6V.A05(r0, r6)) {
                return true;
            }
        }
        return false;
    }

    public final void EZ4(int i) {
        if (!this.A0D || this.A03) {
            this.A06.A03 = i;
        }
        A00(this);
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public final boolean isEmpty() {
        if (this.A04.A02() == 0) {
            return true;
        }
        return false;
    }
}
