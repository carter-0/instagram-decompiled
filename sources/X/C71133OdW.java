package X;

import com.facebook.graphql.enums.EnumHelper;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.OdW  reason: case insensitive filesystem */
public final class C71133OdW {
    public final C70664OFl A00;
    public final O5P A01;
    public final NAX A02;
    public final LightweightQuickPerformanceLogger A03;
    public final O67 A04;

    public static final void A03(C71133OdW odW, String str, String str2, int[] iArr) {
        for (int markerAnnotate : iArr) {
            odW.A03.markerAnnotate(markerAnnotate, str, str2);
        }
    }

    public static final void A04(C71133OdW odW, String str, int[] iArr) {
        for (int markerPoint : iArr) {
            odW.A03.markerPoint(markerPoint, str);
        }
    }

    public static final void A05(C71133OdW odW, String str, int[] iArr, boolean z) {
        for (int i : iArr) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = odW.A03;
            lightweightQuickPerformanceLogger.markerAnnotate(i, TraceFieldType.ErrorCode, str);
            if (i != 1021652813 || z) {
                lightweightQuickPerformanceLogger.markerEnd(i, 3);
            }
        }
    }

    public final C71087ObS A06(String str, boolean z, boolean z2) {
        boolean z3;
        String str2 = str;
        int i = 231356437;
        if (str2.equals("OMNISTORE")) {
            i = 231352282;
        }
        int[] iArr = {1021652813, i};
        C71087ObS A002 = C71087ObS.A00();
        if (!C51971G9r.A1b(this.A01.A00)) {
            N0J.A01(A002, new Exception());
            return A002;
        }
        int i2 = 0;
        do {
            int i3 = iArr[i2];
            z3 = z2;
            if (i3 != 1021652813 || z2) {
                this.A03.markerStartWithCancelPolicy(i3, false, 0, -1, TimeUnit.NANOSECONDS);
            }
            this.A03.markerAnnotate(i3, "source", str2);
            i2++;
        } while (i2 < 2);
        A03(this, "transport", "GRAPHQL", iArr);
        A04(this, "FETCH_BACKUP_STATUS_GRAPHQL_REQUEST_START", iArr);
        A03(this, "request_uuid", C51972G9s.A0n(), iArr);
        O67 o67 = this.A04;
        C73951PmV pmV = new C73951PmV(this, A002, iArr, z3, z);
        C73452Pcu.A00(OUY.A00.A00(o67.A00), new J6W(46, new C58786IxX(1, this, iArr, A002, true, z3), pmV, o67), 1);
        return A002;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.NAX, com.facebook.msys.mca.MailboxFeature] */
    public C71133OdW(C70664OFl oFl, O5P o5p, AnonymousClass68I r4, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, O67 o67) {
        this.A02 = new MailboxFeature(r4);
        this.A03 = lightweightQuickPerformanceLogger;
        this.A01 = o5p;
        this.A00 = oFl;
        this.A04 = o67;
    }

    public static final void A02(C71133OdW odW, C71087ObS obS, C69403Nkh nkh) {
        Object A002;
        Map map = odW.A00.A02;
        if (map != null) {
            Object obj = map.get(nkh.toString());
            if (obj != null) {
                A002 = new N0I(obj);
            } else {
                A002 = N0J.A00(new Exception());
            }
            obS.A05(A002);
            return;
        }
        0qQ.A0F("tpidMap");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final C71087ObS A00(C71133OdW odW, C69403Nkh nkh, String str) {
        C71087ObS A002 = C71087ObS.A00();
        if (!C51971G9r.A1b(odW.A01.A00)) {
            N0J.A01(A002, new Exception());
            return A002;
        } else if (odW.A00.A03) {
            A02(odW, A002, nkh);
            return A002;
        } else {
            odW.A06(str, false, true).A04(new C71524OmL(0, odW, A002, nkh));
            return A002;
        }
    }

    public static final ArrayList A01(List list) {
        Integer num;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            C69411Nkq nkq = (C69411Nkq) EnumHelper.A00(String.valueOf(map.get("virtual_device_type")), C69411Nkq.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            0qQ.A07(nkq);
            C69356Njv A002 = C69684Nq6.A00(nkq);
            C69399Nkd nkd = (C69399Nkd) EnumHelper.A00(String.valueOf(map.get("migration_status")), C69399Nkd.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            0qQ.A07(nkd);
            int ordinal = nkd.ordinal();
            if (ordinal == 2) {
                num = AnonymousClass05K.A0C;
            } else if (ordinal == 1) {
                num = AnonymousClass05K.A01;
            } else if (ordinal == 3) {
                num = AnonymousClass05K.A0N;
            } else if (ordinal != 4) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A0Y;
            }
            if (A002 != null) {
                Object obj = map.get(AnonymousClass000.A00(75));
                if (obj != null) {
                    Long A0q = DbV.A0q((String) obj);
                    Object obj2 = map.get("virtual_device_id");
                    if (obj2 != null) {
                        A1C.add(new C70832ONe(A002, num, A0q, obj2.toString(), String.valueOf(map.get("device_created_on")), (String) map.get("cloud_service_account")));
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
        }
        return A1C;
    }
}
