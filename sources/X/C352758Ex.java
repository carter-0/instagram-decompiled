package X;

import android.text.TextUtils;
import android.util.Pair;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.8Ex  reason: invalid class name and case insensitive filesystem */
public final class C352758Ex implements AnonymousClass0eK {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C313066fn A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public C352758Ex(C313066fn r1, String str, String str2, String str3, long j, long j2, long j3, long j4, boolean z) {
        this.A04 = r1;
        this.A06 = str;
        this.A08 = z;
        this.A05 = str2;
        this.A01 = j;
        this.A02 = j2;
        this.A03 = j3;
        this.A00 = j4;
        this.A07 = str3;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r7v0, types: [X.2ie, X.1LD] */
    public final /* bridge */ /* synthetic */ Object get() {
        String str;
        1L7 A012 = 1L7.A01();
        String A0R = 002.A0R("ard_", this.A06);
        ? r7 = new AnonymousClass1LD();
        r7.A00 = this.A08;
        r7.A05 = this.A05;
        r7.A09 = false;
        r7.A0A = true;
        AnonymousClass1JP r4 = new AnonymousClass1JP();
        long j = this.A01;
        r4.A01 = j;
        r4.A02 = this.A02;
        r4.A03 = this.A03;
        r7.A01 = r4.A00();
        r7.A02 = new 1Fg(((long) ((int) this.A00)) * SandboxRepository.CACHE_TTL, false);
        r7.A06 = this.A07;
        AnonymousClass1LE A002 = r7.A00();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = A012.A00;
        int hashCode = A0R.hashCode();
        String str2 = A002.A05;
        if (str2 == null) {
            str2 = A0R;
        }
        lightweightQuickPerformanceLogger.markerStart(42991640, hashCode, "stash_name", str2);
        try {
            1Fd A003 = 1L7.A00(A002, A0R, 5);
            AnonymousClass1BN r8 = A012.A03.A00;
            1BO r12 = r8.A00;
            if (r12 != null) {
                File A013 = r12.A01(1BO.A00(A003.A02, A003.A00));
                ArrayList arrayList = new ArrayList(A003.A03.values());
                if (!arrayList.isEmpty()) {
                    LinkedList<Pair> linkedList = new LinkedList<>();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        AnonymousClass1BG r14 = (AnonymousClass1BG) it.next();
                        1LX AJo = r8.A01.AJo(r14);
                        if (AJo == null) {
                            r8.Due(A003, r14);
                        } else if (AJo instanceof 1Lj) {
                            linkedList.add(new Pair(r14, AJo));
                        }
                    }
                    Collections.sort(linkedList, r8.A02);
                    for (Pair pair : linkedList) {
                        1Lj r13 = (1Lj) pair.second;
                        1BF r122 = (AnonymousClass1BG) pair.first;
                        if (!r122.A00) {
                            str = null;
                        } else {
                            1B7 r0 = A003.A01;
                            if (r0 == null) {
                                r0 = r13.A01.A01();
                            }
                            str = 1Lk.A00(r0, r122).A01;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            A013 = new File(A013, str);
                        }
                    }
                }
                if (!A013.isDirectory()) {
                    A013.mkdirs();
                }
                1Fi.A00(r8, A003, A013);
                1LU A072 = A012.A07(A002, A013);
                1L7.A02(A072, A003);
                lightweightQuickPerformanceLogger.markerEnd(42991640, hashCode, 2);
                return new AnonymousClass8F1(A072, new AtomicReference(), j);
            }
            throw new IllegalStateException(002.A0R("Base Cask not initialized ", A003.A02));
        } catch (Throwable th) {
            lightweightQuickPerformanceLogger.markerEnd(42991640, hashCode, 3);
            throw th;
        }
    }
}
