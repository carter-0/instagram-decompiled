package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.7Ni  reason: invalid class name and case insensitive filesystem */
public final class C330567Ni implements C331097Pn {
    public boolean A00;
    public boolean A01;
    public final /* synthetic */ C330537Nf A02;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
        if (java.lang.Math.abs(r1 - r3.A03) > (((float) r3.A0E) * 1.0f)) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        if (java.lang.Math.abs(r1 - r3.A02) > (((float) r3.A0E) * 1.0f)) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean DLA(android.view.MotionEvent r13, androidx.recyclerview.widget.RecyclerView r14) {
        /*
            r12 = this;
            r4 = 1
            X.0qQ.A0B(r13, r4)
            int r1 = r13.getActionMasked()
            r11 = 0
            if (r1 == r4) goto L_0x0119
            r0 = 3
            if (r1 == r0) goto L_0x0119
            if (r1 != 0) goto L_0x001e
            X.7Nf r1 = r12.A02
            float r0 = r13.getX()
            r1.A02 = r0
            float r0 = r13.getY()
            r1.A03 = r0
        L_0x001e:
            boolean r0 = r12.A00
            if (r0 != 0) goto L_0x004d
            boolean r0 = r12.A01
            if (r0 != 0) goto L_0x003d
            float r1 = r13.getY()
            X.7Nf r3 = r12.A02
            float r0 = r3.A03
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            int r0 = r3.A0E
            float r0 = (float) r0
            float r0 = r0 * r2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x004d
        L_0x003d:
            r12.A01 = r4
            X.7Nf r0 = r12.A02
            X.7Ne r0 = r0.A0I
            X.0sP r1 = r0.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.invoke(r0)
        L_0x004c:
            return r11
        L_0x004d:
            boolean r0 = r12.A00
            if (r0 != 0) goto L_0x0068
            float r1 = r13.getX()
            X.7Nf r3 = r12.A02
            float r0 = r3.A02
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            int r0 = r3.A0E
            float r0 = (float) r0
            float r0 = r0 * r2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x004c
        L_0x0068:
            X.7Nf r6 = r12.A02
            androidx.recyclerview.widget.RecyclerView r5 = r6.A0F
            int r9 = r5.getChildCount()
            r8 = 0
        L_0x0071:
            if (r8 >= r9) goto L_0x00fb
            android.view.View r0 = r5.getChildAt(r8)
            X.3kE r10 = r5.A0Z(r0)
            boolean r0 = r10 instanceof X.C74330Pt6
            if (r0 == 0) goto L_0x008f
            r2 = r10
            X.Pt6 r2 = (X.C74330Pt6) r2
            if (r2 == 0) goto L_0x008f
            float r1 = r6.A02
            float r0 = r6.A03
            boolean r0 = r2.APx(r1, r0)
            if (r0 == 0) goto L_0x008f
            return r11
        L_0x008f:
            boolean r0 = r10 instanceof X.AnonymousClass7PN
            if (r0 == 0) goto L_0x00a0
            r1 = r10
            X.7PN r1 = (X.AnonymousClass7PN) r1
            if (r1 == 0) goto L_0x00a0
            boolean r0 = r1.EsS(r13)
            if (r0 == 0) goto L_0x00a0
            r6.A04 = r1
        L_0x00a0:
            boolean r0 = r10 instanceof X.AnonymousClass7PM
            if (r0 == 0) goto L_0x00f5
            if (r10 == 0) goto L_0x00f5
            boolean r0 = r6.A07
            if (r0 != 0) goto L_0x00ae
            boolean r0 = r6.A06
            if (r0 == 0) goto L_0x00f5
        L_0x00ae:
            X.7PM r10 = (X.AnonymousClass7PM) r10
            boolean r0 = r10.AFz()
            if (r0 == 0) goto L_0x00f5
            boolean r0 = r10.AG0(r13)
            if (r0 == 0) goto L_0x00f5
            r10.C3V()
            r13.getRawX()
            java.util.List r0 = r10.CFT()
            java.util.Iterator r7 = r0.iterator()
        L_0x00ca:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r3 = r7.next()
            r0 = r3
            android.view.View r0 = (android.view.View) r0
            android.graphics.RectF r2 = X.0nA.A0F(r0)
            float r1 = r13.getRawX()
            float r0 = r13.getRawY()
            boolean r0 = r2.contains(r1, r0)
            if (r0 == 0) goto L_0x00ca
        L_0x00e9:
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x00f5
            r6.A05 = r10
            float r0 = r3.getTranslationX()
            r6.A01 = r0
        L_0x00f5:
            int r8 = r8 + 1
            goto L_0x0071
        L_0x00f9:
            r3 = 0
            goto L_0x00e9
        L_0x00fb:
            X.7PN r0 = r6.A04
            if (r0 != 0) goto L_0x0107
            X.7PM r0 = r6.A05
            if (r0 != 0) goto L_0x0107
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x004c
        L_0x0107:
            r12.A00 = r4
            r5.requestDisallowInterceptTouchEvent(r4)
            X.7Ne r0 = r6.A0I
            X.0sP r1 = r0.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.invoke(r0)
            r11 = 1
            return r11
        L_0x0119:
            r12.A00()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C330567Ni.DLA(android.view.MotionEvent, androidx.recyclerview.widget.RecyclerView):boolean");
    }

    public final void DeF(boolean z) {
    }

    public final void DsW(MotionEvent motionEvent, RecyclerView recyclerView) {
        Integer num;
        float max;
        boolean z;
        C249703kE r6;
        View view;
        float min;
        Long l;
        String str;
        0qQ.A0B(motionEvent, 1);
        int actionMasked = motionEvent.getActionMasked();
        C330537Nf r3 = this.A02;
        AnonymousClass7PN r1 = r3.A04;
        if (r1 != null && r1.Esh()) {
            r1.APf(motionEvent);
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (r1 == null) {
                    if (r3.A05 == null) {
                        if (r3.A08) {
                            float x = motionEvent.getX() - r3.A02;
                            2cs r62 = r3.A0G;
                            float f = (float) r62.A09.A00;
                            boolean z2 = r3.A0J;
                            float f2 = r3.A0D;
                            float f3 = f2 / 3.0f;
                            if (!z2 ? f < f3 : f > f3) {
                                if (!r3.A0A) {
                                    r3.A0A = true;
                                    AnonymousClass7N8 r8 = r3.A0H;
                                    0wc r5 = r8.A00;
                                    0Aj A002 = r5.A00(r5.A00, "swipe_thread_view_to_timestamp");
                                    if (A002.isSampled()) {
                                        2Eq r0 = (2Eq) r8.A04.invoke();
                                        if (r0 != null) {
                                            str = r0.C6k();
                                        } else {
                                            str = null;
                                        }
                                        A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                                        A002.AAJ("swipe_status", "complete");
                                        A002.Cgf();
                                    }
                                }
                                if (!r3.A09) {
                                    r3.A09 = true;
                                    AnonymousClass7N8 r82 = r3.A0H;
                                    AnonymousClass2Ep r12 = (AnonymousClass2Ep) r82.A04.invoke();
                                    if (r12 != null) {
                                        AnonymousClass9L0 r9 = new AnonymousClass9L0(r82, 12);
                                        if (r12.C6a() == 29 && r12.Ce4(r82.A01.A06) && ((Boolean) r9.invoke()).booleanValue()) {
                                            C313756gx r83 = r82.A02;
                                            int AdN = r12.AdN();
                                            String C6C = r12.C6C();
                                            String C6k = r12.C6k();
                                            1Ln A0E = 1Ln.A0E(r83.A03);
                                            if (A0E.A00.isSampled()) {
                                                A0E.A0h(Long.valueOf(r83.A02));
                                                A0E.A0l("view_message_seen_count");
                                                A0E.A0k("swipe");
                                                A0E.A0p("message_metadata");
                                                A0E.A0q("thread_view");
                                                A0E.A0o(C313746gw.A01(Integer.valueOf(AdN)));
                                                A0E.A0s(C6C);
                                                if (C6k != null) {
                                                    l = 00y.A0n(10, C6k);
                                                } else {
                                                    l = null;
                                                }
                                                A0E.A0i(l);
                                                A0E.A0v(r83.A01);
                                                A0E.Cgf();
                                            }
                                        }
                                    }
                                }
                            }
                            if (!z2 ? !(f >= f2 || x >= 0.0f) : !(f <= f2 || x <= 0.0f)) {
                                x *= (float) Math.pow((double) (1.0f - (Math.abs(f - f2) / Math.abs(f2))), 4.0d);
                            }
                            float f4 = f + x;
                            if (z2) {
                                min = Math.max(f4, 0.0f);
                            } else {
                                min = Math.min(f4, 0.0f);
                            }
                            r62.A05((double) min);
                            r3.A02 = motionEvent.getX();
                            return;
                        }
                        return;
                    }
                } else if (!r1.Esh()) {
                    r1.APf(motionEvent);
                }
                AnonymousClass7PM r63 = r3.A05;
                if (r63 != null && C330537Nf.A01(r63.C3V(), motionEvent.getRawX(), r3.A02)) {
                    float rawX = (motionEvent.getRawX() - r3.A02) * 0.3f;
                    RecyclerView recyclerView2 = r3.A0F;
                    recyclerView2.requestDisallowInterceptTouchEvent(true);
                    if (r63.C3V() == AnonymousClass05K.A01) {
                        max = Math.min(rawX, 0.0f);
                    } else {
                        max = Math.max(rawX, 0.0f);
                    }
                    for (View translationX : r63.CFT()) {
                        translationX.setTranslationX(max);
                    }
                    C330537Nf.A00(r3, r63, max);
                    r3.A00 = Math.abs(rawX);
                    float rawX2 = motionEvent.getRawX();
                    Integer C3V = r63.C3V();
                    float f5 = r3.A02;
                    if (!C330537Nf.A01(C3V, rawX2, f5) || Math.abs((rawX2 - f5) * 0.3f) < r63.C3X()) {
                        z = false;
                    } else {
                        if (!r3.A0B && (r63 instanceof C249703kE) && (r6 = (C249703kE) r63) != null && (view = r6.itemView) != null) {
                            view.performHapticFeedback(3);
                        }
                        z = true;
                    }
                    r3.A0B = z;
                    recyclerView2.invalidate();
                    return;
                }
                return;
            } else if (actionMasked != 3) {
                return;
            }
        }
        r3.A0A = false;
        r3.A0G.A06(0.0d);
        r3.A04 = null;
        float x2 = motionEvent.getX();
        AnonymousClass7PM r2 = r3.A05;
        if (r2 != null) {
            Integer C3V2 = r2.C3V();
            float f6 = r3.A02;
            if (C330537Nf.A01(C3V2, x2, f6) && Math.abs((x2 - f6) * 0.3f) >= r2.C3X()) {
                if (!r3.A06 || r3.A07) {
                    num = AnonymousClass05K.A00;
                } else {
                    num = AnonymousClass05K.A01;
                }
                r2.Dq2(num);
            }
            for (View translationX2 : r2.CFT()) {
                translationX2.setTranslationX(r3.A01);
            }
            for (View alpha : r2.CFS()) {
                alpha.setAlpha(1.0f);
            }
            r3.A05 = null;
            r3.A00 = Math.abs(x2 - r3.A02);
            r3.A0F.invalidate();
        }
        A00();
    }

    public C330567Ni(C330537Nf r1) {
        this.A02 = r1;
    }

    private final void A00() {
        C330537Nf r3 = this.A02;
        r3.A05 = null;
        r3.A04 = null;
        this.A00 = false;
        this.A01 = false;
        r3.A0I.A00.invoke(false);
        r3.A0F.requestDisallowInterceptTouchEvent(false);
    }
}
