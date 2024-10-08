package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: X.6cu  reason: invalid class name and case insensitive filesystem */
public final class C311576cu {
    public final UserSession A00;
    public final C270414gh A01;
    public final AnonymousClass0iw A02;

    public C311576cu(AnonymousClass0iw r2, UserSession userSession, C270414gh r4) {
        0qQ.A0B(r4, 1);
        0qQ.A0B(userSession, 2);
        this.A01 = r4;
        this.A00 = userSession;
        this.A02 = r2;
    }

    public final void A00(AnonymousClass3PN r20, String str, int i, boolean z) {
        LinkedHashSet<String> linkedHashSet;
        LinkedHashMap linkedHashMap;
        long j;
        int i2 = i;
        AnonymousClass3PN r12 = r20;
        0qQ.A0B(r12, 2);
        if (z) {
            UserSession userSession = this.A00;
            0Tu r4 = 0Tu.A05;
            long A012 = 182.A01(r4, userSession, 36595204421257299L);
            if (A012 <= 0) {
                A012 = 20;
            }
            long A013 = 182.A01(r4, userSession, 36595204421322836L);
            if (A013 <= 0) {
                A013 = 1;
            }
            linkedHashSet = new LinkedHashSet<>();
            if (i >= 0) {
                C270414gh r9 = this.A01;
                C310636bN r13 = ((C310566bG) r9).A0B;
                int A002 = r13.A00();
                for (int i3 = i2; i3 < A002; i3++) {
                    C250973mM Bky = r9.Bky(i3);
                    if (Bky == null) {
                        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Initial list size: %d, Updated list size: %d", Integer.valueOf(A002), Integer.valueOf(r13.A00()));
                        0qQ.A07(formatStrLocaleSafe);
                        0wb.A03("ReelListAdapter ReelViewModel list changed from another thread", formatStrLocaleSafe);
                    } else if (!Bky.A0H.A1P && !Bky.A0N) {
                        if (!Bky.A0H.A0z(userSession)) {
                            String id = Bky.A0H.getId();
                            0qQ.A07(id);
                            linkedHashSet.add(id);
                        }
                        if (i3 != i2) {
                            Integer num = Bky.A0H.A0e;
                            if (num != null) {
                                j = (long) num.intValue();
                            } else {
                                j = 0;
                            }
                            A012 -= j;
                        }
                    }
                    if (((long) linkedHashSet.size()) >= A012 || (((long) i3) > ((long) i2) + A013 && A012 <= 0)) {
                        break;
                    }
                }
            }
        } else {
            linkedHashSet = new LinkedHashSet<>();
            int i4 = i + 4 + 1;
            while (i2 < i4) {
                if (i2 > 0) {
                    C270414gh r1 = this.A01;
                    if (i2 >= ((C310566bG) r1).A0B.A00()) {
                        continue;
                    } else {
                        C250973mM Bky2 = r1.Bky(i2);
                        if (Bky2 != null) {
                            if (!Bky2.A0H.A0z(this.A00) && !Bky2.A0H.A1P && !Bky2.A0N) {
                                String id2 = Bky2.A0H.getId();
                                0qQ.A07(id2);
                                linkedHashSet.add(id2);
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
                i2++;
            }
        }
        if (!linkedHashSet.isEmpty()) {
            AnonymousClass3PP A003 = AnonymousClass3PO.A00(this.A00);
            String str2 = str;
            if (str != null) {
                linkedHashMap = 0Yt.A07(new 0eP[]{new 0eP(AnonymousClass000.A00(1767), str2)});
            } else {
                linkedHashMap = null;
            }
            String moduleName = this.A02.getModuleName();
            AnonymousClass3BU r14 = AnonymousClass3BU.BUFFER_IN_VIEWER;
            0qQ.A0B(moduleName, 2);
            A003.A01(r14, (C279314yR) null, moduleName, linkedHashMap, linkedHashSet);
            for (String A05 : linkedHashSet) {
                A003.A05(r12, A05, (String) null, false);
            }
        }
    }
}
