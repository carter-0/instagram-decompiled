package X;

import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.5PL  reason: invalid class name */
public abstract class AnonymousClass5PL {
    public final C262094Cc A08() {
        if (this instanceof Recomposer) {
            return ((Recomposer) this).A0J;
        }
        return ((AnonymousClass5Q1) this).A07.A0U.A08();
    }

    public final void A09(C285025Pj r5) {
        1IX r1;
        if (this instanceof AnonymousClass5Q1) {
            C286565Wx r0 = ((AnonymousClass5Q1) this).A07;
            AnonymousClass5PL r12 = r0.A0U;
            r12.A09(r0.A0V);
            r12.A09(r5);
            return;
        }
        Recomposer recomposer = (Recomposer) this;
        synchronized (recomposer.A0D) {
            C285045Pl r13 = recomposer.A0C;
            if (!r13.A0A(r5)) {
                r13.A09(r5);
                r1 = Recomposer.A01(recomposer);
            } else {
                r1 = null;
            }
        }
        if (r1 != null) {
            r1.resumeWith(C60340gF.A00);
        }
    }

    public final void A0A(C285025Pj r4) {
        if (this instanceof Recomposer) {
            Recomposer recomposer = (Recomposer) this;
            synchronized (recomposer.A0D) {
                Set set = recomposer.A04;
                if (set == null) {
                    set = new LinkedHashSet();
                    recomposer.A04 = set;
                }
                set.add(r4);
            }
            return;
        }
        ((AnonymousClass5Q1) this).A07.A0U.A0A(r4);
    }

    public final void A0B(C285025Pj r4) {
        if (this instanceof AnonymousClass5Q1) {
            ((AnonymousClass5Q1) this).A07.A0U.A0B(r4);
            return;
        }
        Recomposer recomposer = (Recomposer) this;
        synchronized (recomposer.A0D) {
            recomposer.A0E.remove(r4);
            recomposer.A03 = null;
            recomposer.A0C.A0B(r4);
            recomposer.A0G.remove(r4);
        }
    }

    public final void A0C(C285025Pj r12, 0sL r13) {
        if (this instanceof Recomposer) {
            Recomposer recomposer = (Recomposer) this;
            AnonymousClass5Wn r7 = (AnonymousClass5Wn) r12;
            C286565Wx r10 = r7.A05;
            boolean z = r10.A0L;
            try {
                AnonymousClass5PD A00 = AnonymousClass5PH.A00(new AnonymousClass9L6(r12, 35), new C377469Ly(6, (Object) null, (Object) r12));
                try {
                    AnonymousClass5P5 r6 = AnonymousClass5P3.A05;
                    Snapshot snapshot = (Snapshot) r6.A00();
                    r6.A01(A00);
                    try {
                        synchronized (r7.A0D) {
                            AnonymousClass5Wn.A01(r7);
                            C286515Wr r2 = r7.A00;
                            r7.A00 = new C286515Wr();
                            try {
                                if (r10.A0E.A00.A02 == 0) {
                                    C286565Wx.A0J(r10, r2, r13);
                                } else {
                                    AnonymousClass5XN.A03("Expected applyChanges() to have been called");
                                    throw AnonymousClass00P.createAndThrow();
                                }
                            } catch (Exception e) {
                                r7.A00 = r2;
                                throw e;
                            }
                        }
                        r6.A01(snapshot);
                        Recomposer.A04(A00);
                        if (!z) {
                            AnonymousClass5P3.A00().A08();
                        }
                        Object obj = recomposer.A0D;
                        synchronized (obj) {
                            if (((AnonymousClass4e5) recomposer.A0K.getValue()).compareTo(AnonymousClass4e5.ShuttingDown) > 0 && !Recomposer.A00(recomposer).contains(r12)) {
                                recomposer.A0E.add(r12);
                                recomposer.A03 = null;
                            }
                        }
                        synchronized (obj) {
                            try {
                                List list = recomposer.A0F;
                                if (0 < list.size()) {
                                    list.get(0);
                                    throw new NullPointerException("getComposition$runtime_release");
                                }
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            r12.ABx();
                            r12.AC3();
                            if (!z) {
                                AnonymousClass5P3.A00().A08();
                            }
                        } catch (Exception e2) {
                            Recomposer.A03((C285025Pj) null, recomposer, e2);
                        }
                    } catch (Throwable th2) {
                        try {
                            Set set = r7.A0E;
                            if (!set.isEmpty()) {
                                new C288445bv(set).A01();
                            }
                            throw th2;
                        } catch (Exception e3) {
                            try {
                                r7.A6v();
                                throw e3;
                            } catch (Throwable th3) {
                                r6.A01(snapshot);
                                throw th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    Recomposer.A04(A00);
                    throw th;
                }
            } catch (Exception e4) {
                Recomposer.A03(r12, recomposer, e4);
            }
        } else {
            ((AnonymousClass5Q1) this).A07.A0U.A0C(r12, r13);
        }
    }

    public final boolean A0D() {
        if (this instanceof Recomposer) {
            return ((Boolean) Recomposer.A0M.get()).booleanValue();
        }
        return ((AnonymousClass5Q1) this).A07.A0U.A0D();
    }
}
