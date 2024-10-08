package X;

import android.content.Context;
import android.util.LruCache;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.7Sw  reason: invalid class name and case insensitive filesystem */
public final class C331897Sw {
    public static C331897Sw A0A;
    public static final 1QU A0B;
    public final Context A00;
    public final 0bY A01 = new 1Q7("IgSecureUriParser").A00;
    public final AnonymousClass7T3 A02 = new LruCache(100);
    public final C331927Sz A03 = new C331927Sz();
    public final LinkedList A04 = new LinkedList();
    public final ConcurrentHashMap A05 = new ConcurrentHashMap();
    public final ExecutorService A06 = Executors.newSingleThreadExecutor();
    public final ExecutorService A07 = Executors.newSingleThreadExecutor();
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A00(0eO.A04, new AnonymousClass9L3(this, 1));
    public volatile boolean A09;

    public static final long A00(FileChannel fileChannel) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        fileChannel.read(allocate);
        allocate.position(0);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        return ((long) allocate.getInt()) & 4294967295L;
    }

    public static final void A01(1JG r7, C331897Sw r8, Runnable runnable, String str, String str2, boolean z, boolean z2) {
        String str3 = str2;
        C227082ic AX8 = r7.AX8(str2);
        Runnable runnable2 = runnable;
        if (AX8.A00 != null) {
            boolean A042 = A04(r8, str2);
            r8.A06.execute(new AnonymousClass732((C227602jb) AX8.A00(), r8, runnable2, str, str3, z, z2, A042));
            return;
        }
        runnable.run();
    }

    public final void A05(C320986tO r7, String str) {
        A06(r7, str, false, false, false);
    }

    public final void A06(C320986tO r10, String str, boolean z, boolean z2, boolean z3) {
        C320986tO r3 = r10;
        String str2 = str;
        if (str == null || !C331917Sy.A02(str)) {
            r10.onError(str);
            return;
        }
        C321186ti r2 = new C321186ti(r3, this, str2, z, z2, z3);
        if (this.A09) {
            11Z.A02(new C14028ToU(r2, this));
        } else {
            this.A07.execute(new C321206tk(r2, this));
        }
    }

    public final boolean A07(String str) {
        0qQ.A0B(str, 0);
        String A002 = this.A03.A00(str);
        if (this.A02.get(A002) != null) {
            return true;
        }
        Collection collection = (Collection) this.A05.get(A002);
        if ((collection == null || collection.isEmpty()) && this.A09) {
            return ((1JG) this.A08.getValue()).CJV(A002);
        }
        return false;
    }

    static {
        AnonymousClass1QT r1 = new AnonymousClass1QT();
        r1.A04 = 1CE.A06;
        r1.A03 = 1Fe.A03;
        A0B = r1.A00();
    }

    public static final void A02(C321356tz r6, C331897Sw r7, String str, String str2) {
        ConcurrentHashMap concurrentHashMap = r7.A05;
        Set<C320986tO> set = (Set) concurrentHashMap.get(str2);
        concurrentHashMap.remove(str2);
        if (set != null) {
            for (C320986tO r2 : set) {
                try {
                    AnonymousClass735 r1 = r6.A00;
                    if (r1 instanceof AnonymousClass734) {
                        C20997X8u ALs = ((AnonymousClass734) r1).ALs();
                        if (A04(r7, str2)) {
                            String str3 = r6.A01;
                            String A002 = ((C227602jb) ((1JG) r7.A08.getValue()).AX8(002.A0R(str2, "_audio")).A00()).A00();
                            0qQ.A07(A002);
                            r2.DOb(ALs, str, str3, A002);
                        } else {
                            r2.DOa(ALs, str, r6.A01);
                        }
                    } else if (r1 instanceof WXT) {
                        r2.DH4(((WXT) r1).A00, str, r6.A01);
                    } else {
                        throw new RuntimeException();
                    }
                } catch (C331907Sx unused) {
                    r2.onError(str);
                }
            }
        }
    }

    public static final void A03(C331897Sw r12, String str, String str2) {
        if (new File(str).exists()) {
            FileChannel channel = new RandomAccessFile(str, "r").getChannel();
            for (long j = 12; j + 8 < channel.size(); j += 8 + A00(channel)) {
                channel.position(j);
                ByteBuffer allocate = ByteBuffer.allocate(4);
                channel.read(allocate);
                byte[] array = allocate.array();
                0qQ.A07(array);
                if (new String(array, AnonymousClass15Q.A05).equals("SOUN")) {
                    ByteBuffer allocate2 = ByteBuffer.allocate((int) A00(channel));
                    A00(channel);
                    channel.read(allocate2);
                    AnonymousClass0eM r4 = r12.A08;
                    String A0R = 002.A0R(str2, "_audio");
                    byte[] array2 = allocate2.array();
                    0qQ.A07(array2);
                    C331917Sy.A01((1JG) r4.getValue(), A0R, array2);
                    ((C227602jb) ((1JG) r4.getValue()).AX8(002.A0R(str2, "_audio")).A00()).A00();
                    return;
                }
            }
        }
    }

    public static final boolean A04(C331897Sw r1, String str) {
        C227082ic AX8 = ((1JG) r1.A08.getValue()).AX8(002.A0R(str, "_audio"));
        if (AX8.A00 == null || !new File(((C227602jb) AX8.A00()).A00()).exists()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.util.LruCache, X.7T3] */
    public C331897Sw(Context context) {
        this.A00 = context;
    }
}
