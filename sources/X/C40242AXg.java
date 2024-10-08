package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.AXg  reason: case insensitive filesystem */
public final class C40242AXg implements AnonymousClass0iw {
    public static final AtomicBoolean A0K = new AtomicBoolean(false);
    public static final String __redex_internal_original_name = "MediaScanner";
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public Bitmap A05;
    public C347927xb A06;
    public C391139sP A07;
    public C39724A6p A08;
    public final Context A09;
    public final BitmapFactory.Options A0A = new BitmapFactory.Options();
    public final UserSession A0B;
    public final C227412jE A0C;
    public final C362928ij A0D;
    public final A6K A0E;
    public final C227382jA A0F;
    public final C282635Eb A0G = ((C282635Eb) C282635Eb.A03.getValue());
    public final ArrayList A0H;
    public final C262224Cq A0I;
    public final boolean A0J;

    private final synchronized void A01(C391139sP r8) {
        this.A07 = r8;
        C39724A6p a6p = this.A08;
        String A0m = AnonymousClass7TG.A0m(r8, "[AMG] Exit Reason:", AnonymousClass7TE.A1A());
        1Av A002 = 1Au.A00(this.A0B);
        if (a6p != null) {
            0qQ.A0B(A0m, 0);
            a6p.A01.append(A0m);
        }
        this.A0G.A00(A0m);
        C362928ij r0 = this.A0D;
        int i = this.A00;
        0xY AR4 = r0.A00.AR4();
        AR4.E5Z("scanned_media_key", i);
        AR4.apply();
        Integer num = r8.A00;
        Integer num2 = AnonymousClass05K.A00;
        if (num == num2 && this.A02 > 0) {
            1Eo.A03(num2, AnonymousClass12T.A00.AOJ(281480192, 3), new MHE((AnonymousClass4D7) null, (Object) this, (Object) A002, 39), this.A0I);
        }
    }

    public final String getModuleName() {
        return "media_scanner";
    }

    public /* synthetic */ C40242AXg(UserSession userSession, C227412jE r9, C227382jA r10) {
        A6K a6k = new A6K(userSession);
        AnonymousClass19S A022 = 19E.A02(AnonymousClass12T.A00.AOJ(426, 3));
        0qQ.A0B(A022, 5);
        this.A0B = userSession;
        this.A0F = r10;
        this.A0C = r9;
        this.A0E = a6k;
        this.A0I = A022;
        Context A062 = userSession.A03.A06();
        this.A09 = A062;
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A0H = A1C;
        if (0tS.A4E.A00().A0U()) {
            this.A08 = (C39724A6p) userSession.A01(C39724A6p.class, new MMW(30, A062.getApplicationContext(), userSession));
        }
        this.A0D = new C362928ij(userSession);
        A1C.add(new C40525AdY(A062));
        IgVoltronModelLoader A002 = IgVoltronModelLoader.Companion.A00(userSession);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36318002936944356L) && A002.arePytorchLibrariesLoaded.get()) {
            A1C.add(new C40526AdZ(A062, new C353698Is(A062, new C40158ATy(0), new AnonymousClass84N(A062, userSession)), userSession));
            A1C.add(new C40524AdX(A062, new AnonymousClass8CO(userSession, AnonymousClass7TE.A1I(C352658Eh.A00(AnonymousClass8Eg.SCENE_UNDERSTANDING)))));
        }
        boolean A063 = 182.A06(r2, userSession, 36318002939238134L);
        if ((182.A06(r2, userSession, 36318874815437353L) && A002.arePytorchLibrariesLoaded.get()) || (A063 && A002.areExecuTorchLibrariesLoaded.get())) {
            A1C.add(new C40527Ada(userSession, A062, A063));
        }
        this.A0J = 182.A06(r2, userSession, 36318002937009893L);
    }

    private final void A00() {
        Integer num;
        String str;
        int i;
        C391139sP r6 = this.A07;
        if (r6 == null) {
            0wb.A03("MediaScanner#exitedWithoutExitReason", "");
            A01(C391139sP.UNKNOWN);
            num = null;
        } else {
            num = r6.A00;
        }
        Integer num2 = AnonymousClass05K.A00;
        A6K a6k = this.A0E;
        if (num == num2) {
            str = r6.name();
            i = 0;
            0qQ.A0B(str, 0);
        } else {
            if (r6 == null || (str = r6.name()) == null) {
                str = "UNKNOWN";
            }
            i = 1;
        }
        C58694Iw3 iw3 = new C58694Iw3(str, a6k, i);
        if (a6k.A00 != -1) {
            iw3.invoke();
        }
        C347927xb r0 = this.A06;
        if (r0 != null) {
            r0.A00.close();
        }
        if (r6 == null) {
            throw AnonymousClass7TE.A0y();
        }
    }

    private final boolean A02() {
        C391139sP r0;
        if (this.A07 == null) {
            if (this.A02 >= Integer.MAX_VALUE) {
                r0 = C391139sP.ITEM_SCAN_LIMIT_REACHED;
            } else if (Thread.currentThread().isInterrupted()) {
                r0 = C391139sP.STOPPED;
            } else if (AnonymousClass1K7.A00().A0E()) {
                r0 = C391139sP.LOW_MEMORY;
            } else {
                if (182.A06(0Tu.A05, this.A0B, 36322220594702344L) && !C2604245p.A03(this.A09)) {
                    r0 = C391139sP.NO_PERMISSION;
                }
            }
            A01(r0);
        }
        return AnonymousClass7TF.A1V(this.A07);
    }

    /* JADX WARNING: type inference failed for: r1v48, types: [X.8aJ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v90, types: [X.8aI, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03d0, code lost:
        if (r1 == false) goto L_0x03d2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:135:0x031e */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0322 A[Catch:{ Exception -> 0x055f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r40 = this;
            r4 = r40
            X.2jA r0 = r4.A0F
            com.instagram.common.session.UserSession r15 = r4.A0B
            r3 = 0
            boolean r0 = r0.A01(r15)
            if (r0 != 0) goto L_0x0029
            X.2jE r0 = r4.A0C
            boolean r0 = r0.A01(r15, r3)
            if (r0 != 0) goto L_0x0029
            X.2jG r0 = new X.2jG
            r0.<init>(r15)
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x0029
            X.9sP r0 = X.C391139sP.FEATURE_NOT_ENABLED
            r4.A01(r0)
        L_0x0025:
            r4.A00()
            return
        L_0x0029:
            java.util.concurrent.atomic.AtomicBoolean r2 = A0K
            r20 = 1
            r0 = r20
            boolean r0 = r2.getAndSet(r0)
            if (r0 == 0) goto L_0x0039
            r4.A04()
            goto L_0x0025
        L_0x0039:
            X.A6K r7 = r4.A0E
            boolean r8 = X.14i.A08()
            X.29E r6 = r7.A01
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MINUTES
            r0 = 15
            long r0 = r5.toMillis(r0)
            r21 = 0
            r5 = 17637859(0x10d21e3, float:2.5921922E-38)
            long r0 = r6.A03(r5, r0)
            r7.A00 = r0
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r5 = 249(0xf9, float:3.49E-43)
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            r6.A09(r0, r5, r8)
            X.2jG r1 = new X.2jG
            r1.<init>(r15)
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x00a8
            com.instagram.common.session.UserSession r6 = r1.A00
            X.0Tu r5 = X.0Tu.A05
            r0 = 36609128705431331(0x820fcf00061723, double:3.215098634219314E-306)
            long r0 = X.182.A01(r5, r6, r0)
            int r8 = (int) r0
        L_0x007a:
            long r5 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r22 = java.util.concurrent.TimeUnit.DAYS
            long r0 = (long) r8
            r38 = r0
            r8 = r22
            long r0 = r8.toMillis(r0)
            long r5 = r5 - r0
            r4.A04 = r5
            X.0Tu r5 = X.0Tu.A05
            r0 = 36599477915422243(0x820708001d0e23, double:3.2089954357569543E-306)
            long r0 = X.182.A01(r5, r15, r0)
            int r5 = (int) r0
            r4.A01 = r5
            java.lang.System.currentTimeMillis()
            boolean r0 = r4.A02()
            if (r0 == 0) goto L_0x00ad
            r2.set(r3)
            goto L_0x0025
        L_0x00a8:
            int r8 = X.C227382jA.A00(r15)
            goto L_0x007a
        L_0x00ad:
            android.content.Context r0 = r4.A09     // Catch:{ Exception -> 0x00c7 }
            java.io.File r0 = r0.getFilesDir()     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r5 = r0.getParent()     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r0 = "/shared_prefs/media_scanner_prefs.xml"
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x00c7 }
            r1.<init>(r5, r0)     // Catch:{ Exception -> 0x00c7 }
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x00c7 }
            if (r0 == 0) goto L_0x00c7
            r1.delete()     // Catch:{ Exception -> 0x00c7 }
        L_0x00c7:
            r4.A00 = r3
            android.content.Context r0 = r4.A09     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r37 = r0
            X.7xb r1 = new X.7xb     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r1.<init>(r0)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r4.A06 = r1     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r0 = 31
            X.Phb r8 = new X.Phb     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r8.<init>(r7, r0)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            long r0 = r7.A00     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r6 = -1
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x00e6
            r8.invoke()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
        L_0x00e6:
            r28 = 0
        L_0x00e8:
            boolean r0 = r4.A02()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            if (r0 == 0) goto L_0x00f6
            r2.set(r3)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
        L_0x00f1:
            r4.A00()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            goto L_0x062c
        L_0x00f6:
            android.content.ContentResolver r24 = r37.getContentResolver()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            X.0qQ.A07(r24)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r1 = 0
            X.8XO r25 = X.AnonymousClass8XO.PHOTO_AND_VIDEO     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            int r0 = r4.A03     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r27 = 30
            r31 = -1
            X.0sn r26 = X.0sn.A00     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r29 = r0
            r30 = r3
            r33 = r31
            r35 = r3
            r36 = r3
            java.util.ArrayList r25 = X.C358038aG.A01(r24, r25, r26, r27, r28, r29, r30, r31, r33, r35, r36)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            int r0 = r25.size()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            int r28 = r28 + r0
            int r24 = r25.size()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            boolean r0 = r25.isEmpty()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            if (r0 != 0) goto L_0x057b
            int r6 = r25.size()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
        L_0x012a:
            if (r1 >= r6) goto L_0x013c
            r0 = r25
            java.lang.Object r5 = r0.get(r1)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            com.instagram.common.gallery.Medium r5 = (com.instagram.common.gallery.Medium) r5     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r0 = r37
            X.C348317yF.A02(r0, r5)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            int r1 = r1 + 1
            goto L_0x012a
        L_0x013c:
            boolean r0 = r4.A02()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            if (r0 != 0) goto L_0x00f1
            X.7xb r0 = r4.A06     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            if (r0 == 0) goto L_0x05f6
            X.1VY r0 = r0.A00     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            X.1W6 r14 = r0.CGp()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r0 = r20
            java.util.ArrayList r1 = X.AnonymousClass7TF.A0q(r14, r0)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            java.util.Iterator r5 = r25.iterator()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
        L_0x0156:
            boolean r0 = r5.hasNext()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            if (r0 == 0) goto L_0x016c
            java.lang.Object r0 = r5.next()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            int r0 = r0.A05     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r1.add(r0)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            goto L_0x0156
        L_0x016c:
            java.util.List r0 = X.A0E.A00(r14, r1)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            java.util.HashMap r7 = X.AnonymousClass7TE.A1E()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
        L_0x0178:
            boolean r0 = r5.hasNext()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            if (r0 == 0) goto L_0x018a
            java.lang.Object r1 = r5.next()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            X.8aI r1 = (X.C358058aI) r1     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            java.lang.String r0 = r1.A0L     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r7.put(r0, r1)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            goto L_0x0178
        L_0x018a:
            java.util.Iterator r6 = r25.iterator()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
        L_0x018e:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            if (r0 == 0) goto L_0x01b7
            java.lang.Object r5 = r6.next()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            com.instagram.common.gallery.Medium r5 = (com.instagram.common.gallery.Medium) r5     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            int r0 = r5.A05     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            boolean r0 = r7.containsKey(r0)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            if (r0 != 0) goto L_0x018e
            X.8aI r1 = new X.8aI     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r1.<init>()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            int r0 = r5.A05     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r1.A0L = r0     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r7.put(r0, r1)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            goto L_0x018e
        L_0x01b7:
            X.A6p r6 = r4.A08     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            if (r6 == 0) goto L_0x01c2
            java.lang.String r1 = "[AMG] location and scene recognizer scanners started \n"
            java.lang.StringBuilder r0 = r6.A01     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r0.append(r1)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
        L_0x01c2:
            int r23 = r25.size()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r5 = 0
        L_0x01c7:
            r0 = r23
            if (r5 >= r0) goto L_0x056b
            boolean r0 = r4.A02()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            if (r0 != 0) goto L_0x0579
            r0 = r25
            java.lang.Object r8 = r0.get(r5)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            com.instagram.common.gallery.Medium r8 = (com.instagram.common.gallery.Medium) r8     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            X.0qQ.A0B(r8, r3)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            java.lang.String r1 = r8.A0O     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            if (r1 == 0) goto L_0x01f8
            java.util.regex.Pattern r0 = com.instagram.common.gallery.Medium.A0j     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            java.util.regex.Matcher r0 = r0.matcher(r1)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            boolean r0 = r0.matches()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            if (r0 != 0) goto L_0x0556
            java.lang.String r1 = r8.A0O     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            java.lang.String r0 = "0"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            if (r0 == 0) goto L_0x01f8
            goto L_0x0556
        L_0x01f8:
            long r9 = r8.A0D     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            long r0 = r4.A04     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            int r11 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r11 >= 0) goto L_0x0204
            int r9 = r5 % 20
            if (r9 != 0) goto L_0x0556
        L_0x0204:
            long r9 = r8.A0D     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            int r11 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x0214
            int r1 = r4.A00     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            int r0 = r4.A01     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            int r0 = r0 + -100
            if (r1 <= r0) goto L_0x0214
            goto L_0x0556
        L_0x0214:
            int r0 = r8.A05     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            java.lang.Object r9 = r7.get(r0)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            X.8aI r9 = (X.C358058aI) r9     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            if (r9 == 0) goto L_0x0556
            boolean r0 = r4.A0J     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r19 = r0
            if (r0 != 0) goto L_0x025e
            java.util.ArrayList r0 = r4.A0H     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            java.util.Iterator r11 = X.AnonymousClass7TE.A1G(r0)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
        L_0x022e:
            boolean r0 = r11.hasNext()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            if (r0 == 0) goto L_0x0256
            java.lang.Object r0 = X.AnonymousClass7TF.A0a(r11)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            X.B2d r0 = (X.C41822B2d) r0     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            java.lang.String r10 = r0.getName()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r1 = 2
            X.8aJ r0 = r9.A00     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            if (r0 == 0) goto L_0x025e
            java.util.HashMap r0 = r0.A00     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            if (r0 == 0) goto L_0x025e
            java.lang.Object r0 = r0.get(r10)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            if (r0 == 0) goto L_0x025e
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            if (r0 < r1) goto L_0x025e
            goto L_0x022e
        L_0x0256:
            int r0 = r4.A00     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            int r0 = r0 + 1
            r4.A00 = r0     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            goto L_0x0556
        L_0x025e:
            r12 = r26
            java.util.ArrayList r0 = r4.A0H     // Catch:{ Exception -> 0x055f }
            java.util.Iterator r18 = X.AnonymousClass7TE.A1G(r0)     // Catch:{ Exception -> 0x055f }
        L_0x0266:
            boolean r0 = r18.hasNext()     // Catch:{ Exception -> 0x055f }
            if (r0 == 0) goto L_0x0417
            java.lang.Object r0 = X.AnonymousClass7TF.A0a(r18)     // Catch:{ Exception -> 0x055f }
            X.B2d r0 = (X.C41822B2d) r0     // Catch:{ Exception -> 0x055f }
            if (r19 != 0) goto L_0x0290
            java.lang.String r11 = r0.getName()     // Catch:{ Exception -> 0x055f }
            r10 = 2
            X.8aJ r1 = r9.A00     // Catch:{ Exception -> 0x055f }
            if (r1 == 0) goto L_0x0290
            java.util.HashMap r1 = r1.A00     // Catch:{ Exception -> 0x055f }
            if (r1 == 0) goto L_0x0290
            java.lang.Object r1 = r1.get(r11)     // Catch:{ Exception -> 0x055f }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x055f }
            if (r1 == 0) goto L_0x0290
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x055f }
            if (r1 < r10) goto L_0x0290
            goto L_0x0266
        L_0x0290:
            java.util.List r17 = r0.ADt()     // Catch:{ Exception -> 0x055f }
            boolean r1 = X.AnonymousClass7TE.A1b(r17)     // Catch:{ Exception -> 0x055f }
            if (r1 == 0) goto L_0x03d2
            r1 = r17
            boolean r1 = X.0qQ.A0K(r12, r1)     // Catch:{ Exception -> 0x055f }
            if (r1 != 0) goto L_0x03d2
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x055f }
            r1 = 29
            if (r10 < r1) goto L_0x02c2
            android.content.ContentResolver r29 = r37.getContentResolver()     // Catch:{ Exception -> 0x055f }
            X.0qQ.A07(r29)     // Catch:{ Exception -> 0x055f }
            r35 = 512(0x200, float:7.175E-43)
            r30 = r21
            r31 = r21
            r32 = r8
            r33 = r15
            r34 = r21
            r36 = r35
            android.graphics.Bitmap r11 = X.C348317yF.A00(r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ Exception -> 0x055f }
            goto L_0x0324
        L_0x02c2:
            android.graphics.BitmapFactory$Options r10 = r4.A0A     // Catch:{ Exception -> 0x055f }
            r1 = r37
            X.C348317yF.A01(r1, r10, r8, r3)     // Catch:{ Exception -> 0x055f }
            java.lang.String r13 = r8.A0a     // Catch:{ Exception -> 0x055f }
            if (r13 == 0) goto L_0x03cb
            android.graphics.Rect r1 = X.1MF.A0H(r13)     // Catch:{ Exception -> 0x055f }
            int r11 = r1.width()     // Catch:{ Exception -> 0x055f }
            int r12 = r1.height()     // Catch:{ Exception -> 0x055f }
            r8.A0B = r11     // Catch:{ Exception -> 0x055f }
            r8.A04 = r12     // Catch:{ Exception -> 0x055f }
            r10 = 512(0x200, float:7.175E-43)
            int r1 = r8.A07     // Catch:{ Exception -> 0x055f }
            int r1 = r1 % 180
            r16 = r12
            if (r1 != 0) goto L_0x02ea
            r16 = r11
            r11 = r12
        L_0x02ea:
            r12 = 1
        L_0x02eb:
            int r1 = r16 / r12
            if (r1 <= r10) goto L_0x02f6
            int r1 = r11 / r12
            if (r1 <= r10) goto L_0x02f6
            int r12 = r12 * 2
            goto L_0x02eb
        L_0x02f6:
            java.io.File r1 = X.AnonymousClass7TE.A0t(r13)     // Catch:{ Exception -> 0x055f }
            com.instagram.common.typedurl.SimpleImageUrl r11 = X.C253833rU.A01(r1)     // Catch:{ Exception -> 0x055f }
            X.48Q r13 = new X.48Q     // Catch:{ Exception -> 0x055f }
            r13.<init>()     // Catch:{ Exception -> 0x055f }
            X.1NK r10 = X.1NK.A00()     // Catch:{ Exception -> 0x055f }
            java.lang.String r1 = "media_scanner"
            X.1OO r1 = r10.A0J(r11, r1)     // Catch:{ Exception -> 0x055f }
            r1.A02(r13)     // Catch:{ Exception -> 0x055f }
            r1.A01 = r12     // Catch:{ Exception -> 0x055f }
            r1.A01()     // Catch:{ Exception -> 0x055f }
            java.util.concurrent.CountDownLatch r12 = r13.A01     // Catch:{ InterruptedException -> 0x031e }
            r10 = 10
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x031e }
            r12.await(r10, r1)     // Catch:{ InterruptedException -> 0x031e }
        L_0x031e:
            X.3LX r1 = r13.A00     // Catch:{ Exception -> 0x055f }
            if (r1 == 0) goto L_0x03cb
            android.graphics.Bitmap r11 = r1.A01     // Catch:{ Exception -> 0x055f }
        L_0x0324:
            if (r11 == 0) goto L_0x03cb
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x055f }
            java.util.Iterator r13 = r17.iterator()     // Catch:{ Exception -> 0x055f }
        L_0x032e:
            boolean r1 = r13.hasNext()     // Catch:{ Exception -> 0x055f }
            if (r1 == 0) goto L_0x0340
            java.lang.Object r10 = r13.next()     // Catch:{ Exception -> 0x055f }
            boolean r1 = r10 instanceof X.C389169p0     // Catch:{ Exception -> 0x055f }
            if (r1 == 0) goto L_0x032e
            r12.add(r10)     // Catch:{ Exception -> 0x055f }
            goto L_0x032e
        L_0x0340:
            java.lang.Object r1 = X.00k.A0J(r12)     // Catch:{ Exception -> 0x055f }
            X.9p0 r1 = (X.C389169p0) r1     // Catch:{ Exception -> 0x055f }
            if (r1 == 0) goto L_0x0366
            int r12 = r1.A00     // Catch:{ Exception -> 0x055f }
            int r10 = r11.getWidth()     // Catch:{ Exception -> 0x055f }
            int r1 = r11.getHeight()     // Catch:{ Exception -> 0x055f }
            if (r10 >= r1) goto L_0x0380
            int r10 = r11.getHeight()     // Catch:{ Exception -> 0x055f }
            int r10 = r10 * r12
            int r1 = r11.getWidth()     // Catch:{ Exception -> 0x055f }
            int r10 = r10 / r1
        L_0x035e:
            r1 = r20
            android.graphics.Bitmap r11 = X.0fO.A00(r11, r12, r10, r1)     // Catch:{ Exception -> 0x055f }
            r4.A05 = r11     // Catch:{ Exception -> 0x055f }
        L_0x0366:
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x055f }
            java.util.Iterator r13 = r17.iterator()     // Catch:{ Exception -> 0x055f }
        L_0x036e:
            boolean r1 = r13.hasNext()     // Catch:{ Exception -> 0x055f }
            if (r1 == 0) goto L_0x038d
            java.lang.Object r10 = r13.next()     // Catch:{ Exception -> 0x055f }
            boolean r1 = r10 instanceof X.C389159oz     // Catch:{ Exception -> 0x055f }
            if (r1 == 0) goto L_0x036e
            r12.add(r10)     // Catch:{ Exception -> 0x055f }
            goto L_0x036e
        L_0x0380:
            int r13 = r11.getWidth()     // Catch:{ Exception -> 0x055f }
            int r13 = r13 * r12
            int r1 = r11.getHeight()     // Catch:{ Exception -> 0x055f }
            int r13 = r13 / r1
            r10 = r12
            r12 = r13
            goto L_0x035e
        L_0x038d:
            java.lang.Object r1 = X.00k.A0J(r12)     // Catch:{ Exception -> 0x055f }
            X.9oz r1 = (X.C389159oz) r1     // Catch:{ Exception -> 0x055f }
            if (r1 == 0) goto L_0x03cd
            int r10 = r1.A00     // Catch:{ Exception -> 0x055f }
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ Exception -> 0x055f }
            boolean r1 = X.1MF.A02     // Catch:{ Exception -> 0x055f }
            int r30 = r11.getWidth()     // Catch:{ Exception -> 0x055f }
            int r31 = r11.getHeight()     // Catch:{ Exception -> 0x055f }
            android.graphics.Matrix r1 = X.AnonymousClass7TE.A0U()     // Catch:{ Exception -> 0x055f }
            r29 = r1
            r32 = r10
            r33 = r10
            r34 = r3
            r35 = r3
            X.1MF.A0J(r29, r30, r31, r32, r33, r34, r35)     // Catch:{ Exception -> 0x055f }
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createBitmap(r10, r10, r12)     // Catch:{ Exception -> 0x055f }
            android.graphics.Canvas r12 = new android.graphics.Canvas     // Catch:{ Exception -> 0x055f }
            r12.<init>(r13)     // Catch:{ Exception -> 0x055f }
            r10 = 3
            android.graphics.Paint r10 = X.AnonymousClass7TE.A0V(r10)     // Catch:{ Exception -> 0x055f }
            r12.drawBitmap(r11, r1, r10)     // Catch:{ Exception -> 0x055f }
            X.0qQ.A07(r13)     // Catch:{ Exception -> 0x055f }
            r4.A05 = r13     // Catch:{ Exception -> 0x055f }
            goto L_0x03cd
        L_0x03cb:
            r1 = 0
            goto L_0x03ce
        L_0x03cd:
            r1 = 1
        L_0x03ce:
            r12 = r17
            if (r1 != 0) goto L_0x03d8
        L_0x03d2:
            boolean r1 = r17.isEmpty()     // Catch:{ Exception -> 0x055f }
            if (r1 == 0) goto L_0x0266
        L_0x03d8:
            android.graphics.Bitmap r1 = r4.A05     // Catch:{ Exception -> 0x055f }
            boolean r1 = r0.EKL(r1, r8, r9)     // Catch:{ Exception -> 0x055f }
            if (r1 == 0) goto L_0x0266
            java.lang.String r11 = r0.getName()     // Catch:{ Exception -> 0x055f }
            r10 = 2
            X.8aJ r1 = r9.A00     // Catch:{ Exception -> 0x055f }
            if (r1 != 0) goto L_0x03f0
            X.8aJ r1 = new X.8aJ     // Catch:{ Exception -> 0x055f }
            r1.<init>()     // Catch:{ Exception -> 0x055f }
            r9.A00 = r1     // Catch:{ Exception -> 0x055f }
        L_0x03f0:
            java.util.HashMap r0 = r1.A00     // Catch:{ Exception -> 0x055f }
            if (r0 != 0) goto L_0x03fa
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()     // Catch:{ Exception -> 0x055f }
            r1.A00 = r0     // Catch:{ Exception -> 0x055f }
        L_0x03fa:
            java.lang.Object r0 = r0.get(r11)     // Catch:{ Exception -> 0x055f }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x055f }
            if (r0 == 0) goto L_0x040a
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x055f }
            if (r0 < r10) goto L_0x040a
            goto L_0x0266
        L_0x040a:
            java.util.HashMap r0 = r1.A00     // Catch:{ Exception -> 0x055f }
            if (r0 == 0) goto L_0x0266
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x055f }
            r0.put(r11, r1)     // Catch:{ Exception -> 0x055f }
            goto L_0x0266
        L_0x0417:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x055f }
            long r0 = r8.A0D     // Catch:{ Exception -> 0x055f }
            long r0 = r10.toSeconds(r0)     // Catch:{ Exception -> 0x055f }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x055f }
            r9.A0H = r0     // Catch:{ Exception -> 0x055f }
            r0 = r14
            X.1W5 r0 = (X.1W5) r0     // Catch:{ RuntimeException -> 0x0533 }
            android.database.sqlite.SQLiteDatabase r13 = r0.A00     // Catch:{ RuntimeException -> 0x0533 }
            r0 = 532084787(0x1fb6f833, float:7.749061E-20)
            X.AnonymousClass0fa.A02(r13, r0)     // Catch:{ RuntimeException -> 0x0533 }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ RuntimeException -> 0x0533 }
            r12.<init>()     // Catch:{ RuntimeException -> 0x0533 }
            java.lang.String r1 = "id"
            java.lang.String r0 = r9.A0L     // Catch:{ RuntimeException -> 0x0533 }
            r12.put(r1, r0)     // Catch:{ RuntimeException -> 0x0533 }
            X.8aJ r11 = r9.A00     // Catch:{ RuntimeException -> 0x0533 }
            if (r11 == 0) goto L_0x048f
            java.lang.String r10 = "scanner_versions"
            java.io.StringWriter r8 = new java.io.StringWriter     // Catch:{ IOException -> 0x0483 }
            r8.<init>()     // Catch:{ IOException -> 0x0483 }
            X.17W r1 = X.AnonymousClass7TF.A0K(r8)     // Catch:{ IOException -> 0x0483 }
            java.util.HashMap r0 = r11.A00     // Catch:{ IOException -> 0x0483 }
            if (r0 == 0) goto L_0x047e
            java.lang.String r0 = "completed_versions"
            r1.A0q(r0)     // Catch:{ IOException -> 0x0483 }
            r1.A0c()     // Catch:{ IOException -> 0x0483 }
            java.util.HashMap r0 = r11.A00     // Catch:{ IOException -> 0x0483 }
            java.util.Iterator r16 = X.AnonymousClass7TF.A0s(r0)     // Catch:{ IOException -> 0x0483 }
        L_0x045d:
            boolean r0 = r16.hasNext()     // Catch:{ IOException -> 0x0483 }
            if (r0 == 0) goto L_0x047b
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r16)     // Catch:{ IOException -> 0x0483 }
            boolean r11 = X.16P.A04(r1, r0)     // Catch:{ IOException -> 0x0483 }
            if (r11 != 0) goto L_0x045d
            java.lang.Object r0 = r0.getValue()     // Catch:{ IOException -> 0x0483 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IOException -> 0x0483 }
            int r0 = r0.intValue()     // Catch:{ IOException -> 0x0483 }
            r1.A0g(r0)     // Catch:{ IOException -> 0x0483 }
            goto L_0x045d
        L_0x047b:
            r1.A0Z()     // Catch:{ IOException -> 0x0483 }
        L_0x047e:
            java.lang.String r0 = X.AnonymousClass7TG.A0k(r1, r8)     // Catch:{ IOException -> 0x0483 }
            goto L_0x048c
        L_0x0483:
            r8 = move-exception
            java.lang.String r1 = "GalleryMediaMetadata"
            java.lang.String r0 = "failed to serialize completed scanner versions"
            X.0KC.A0F(r1, r0, r8)     // Catch:{ RuntimeException -> 0x0533 }
            r0 = 0
        L_0x048c:
            r12.put(r10, r0)     // Catch:{ RuntimeException -> 0x0533 }
        L_0x048f:
            java.lang.String r1 = "feature_name"
            java.lang.String r0 = r9.A0K     // Catch:{ RuntimeException -> 0x0533 }
            r12.put(r1, r0)     // Catch:{ RuntimeException -> 0x0533 }
            java.lang.String r1 = "locality"
            java.lang.String r0 = r9.A0M     // Catch:{ RuntimeException -> 0x0533 }
            r12.put(r1, r0)     // Catch:{ RuntimeException -> 0x0533 }
            java.lang.String r1 = "sub_admin_area"
            java.lang.String r0 = r9.A0N     // Catch:{ RuntimeException -> 0x0533 }
            r12.put(r1, r0)     // Catch:{ RuntimeException -> 0x0533 }
            java.lang.String r1 = "admin_area"
            java.lang.String r0 = r9.A0I     // Catch:{ RuntimeException -> 0x0533 }
            r12.put(r1, r0)     // Catch:{ RuntimeException -> 0x0533 }
            java.lang.String r1 = "country_name"
            java.lang.String r0 = r9.A0J     // Catch:{ RuntimeException -> 0x0533 }
            r12.put(r1, r0)     // Catch:{ RuntimeException -> 0x0533 }
            java.lang.String r1 = "ocn_score"
            java.lang.Float r0 = r9.A08     // Catch:{ RuntimeException -> 0x0533 }
            r12.put(r1, r0)     // Catch:{ RuntimeException -> 0x0533 }
            java.lang.String r1 = "ocv_score"
            java.lang.Float r0 = r9.A0F     // Catch:{ RuntimeException -> 0x0533 }
            r12.put(r1, r0)     // Catch:{ RuntimeException -> 0x0533 }
            java.lang.String r1 = "person_score"
            java.lang.Float r0 = r9.A0A     // Catch:{ RuntimeException -> 0x0533 }
            r12.put(r1, r0)     // Catch:{ RuntimeException -> 0x0533 }
            java.lang.String r1 = "food_score"
            java.lang.Float r0 = r9.A05     // Catch:{ RuntimeException -> 0x0533 }
            r12.put(r1, r0)     // Catch:{ RuntimeException -> 0x0533 }
            java.lang.String r1 = "pet_score"
            java.lang.Float r0 = r9.A0B     // Catch:{ RuntimeException -> 0x0533 }
            r12.put(r1, r0)     // Catch:{ RuntimeException -> 0x0533 }
            java.lang.String r1 = "nature_score"
            java.lang.Float r0 = r9.A07     // Catch:{ RuntimeException -> 0x0533 }
            r12.put(r1, r0)     // Catch:{ RuntimeException -> 0x0533 }
            java.lang.String r1 = "landmark_score"
            java.lang.Float r0 = r9.A06     // Catch:{ RuntimeException -> 0x0533 }
            r12.put(r1, r0)     // Catch:{ RuntimeException -> 0x0533 }
            java.lang.String r1 = "aesthetic_score"
            java.lang.Float r0 = r9.A01     // Catch:{ RuntimeException -> 0x0533 }
            r12.put(r1, r0)     // Catch:{ RuntimeException -> 0x0533 }
            java.lang.String r1 = "blur_score"
            java.lang.Float r0 = r9.A02     // Catch:{ RuntimeException -> 0x0533 }
            r12.put(r1, r0)     // Catch:{ RuntimeException -> 0x0533 }
            java.lang.String r1 = "plant_score"
            java.lang.Float r0 = r9.A0C     // Catch:{ RuntimeException -> 0x0533 }
            r12.put(r1, r0)     // Catch:{ RuntimeException -> 0x0533 }
            java.lang.String r1 = "sports_score"
            java.lang.Float r0 = r9.A0D     // Catch:{ RuntimeException -> 0x0533 }
            r12.put(r1, r0)     // Catch:{ RuntimeException -> 0x0533 }
            java.lang.String r1 = "vehicle_score"
            java.lang.Float r0 = r9.A0E     // Catch:{ RuntimeException -> 0x0533 }
            r12.put(r1, r0)     // Catch:{ RuntimeException -> 0x0533 }
            java.lang.String r1 = "water_score"
            java.lang.Float r0 = r9.A0G     // Catch:{ RuntimeException -> 0x0533 }
            r12.put(r1, r0)     // Catch:{ RuntimeException -> 0x0533 }
            java.lang.String r1 = "outdoors_score"
            java.lang.Float r0 = r9.A09     // Catch:{ RuntimeException -> 0x0533 }
            r12.put(r1, r0)     // Catch:{ RuntimeException -> 0x0533 }
            java.lang.String r1 = "event_score"
            java.lang.Float r0 = r9.A04     // Catch:{ RuntimeException -> 0x0533 }
            r12.put(r1, r0)     // Catch:{ RuntimeException -> 0x0533 }
            java.lang.String r1 = "document_score"
            java.lang.Float r0 = r9.A03     // Catch:{ RuntimeException -> 0x0533 }
            r12.put(r1, r0)     // Catch:{ RuntimeException -> 0x0533 }
            java.lang.String r1 = "date_sec"
            java.lang.Long r0 = r9.A0H     // Catch:{ RuntimeException -> 0x0533 }
            r12.put(r1, r0)     // Catch:{ RuntimeException -> 0x0533 }
            java.lang.String r1 = "gallery_media_metadata"
            r0 = 5
            r14.CNQ(r12, r1, r0)     // Catch:{ RuntimeException -> 0x0533 }
            r13.setTransactionSuccessful()     // Catch:{ RuntimeException -> 0x0533 }
            goto L_0x0539
        L_0x0533:
            r1 = move-exception
            java.lang.String r0 = "GalleryMediaMetadataDatabaseAccessHelper#save"
            X.0wb.A07(r0, r1)     // Catch:{ all -> 0x055a }
        L_0x0539:
            r14.ASV()     // Catch:{ Exception -> 0x055f }
            int r0 = r4.A02     // Catch:{ Exception -> 0x055f }
            int r0 = r0 + 1
            r4.A02 = r0     // Catch:{ Exception -> 0x055f }
            int r0 = r4.A00     // Catch:{ Exception -> 0x055f }
            int r0 = r0 + 1
            r4.A00 = r0     // Catch:{ Exception -> 0x055f }
            X.4Cq r9 = r4.A0I     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r8 = 32
            X.MG8 r1 = new X.MG8     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r0 = r21
            r1.<init>(r4, r0, r8)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            X.AnonymousClass7TE.A1Z(r1, r9)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
        L_0x0556:
            int r5 = r5 + 1
            goto L_0x01c7
        L_0x055a:
            r0 = move-exception
            r14.ASV()     // Catch:{ Exception -> 0x055f }
            throw r0     // Catch:{ Exception -> 0x055f }
        L_0x055f:
            r1 = move-exception
            java.lang.String r0 = "MediaScannerWorker#scanMedia"
            X.0wb.A07(r0, r1)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            X.9sP r0 = X.C391139sP.EXCEPTION     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r4.A01(r0)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            goto L_0x0579
        L_0x056b:
            if (r6 == 0) goto L_0x0579
            java.lang.String r0 = "[AMG] location and scene recognizer scanners DONE! \n"
            java.lang.StringBuilder r1 = r6.A01     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r1.append(r0)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            java.lang.String r0 = "[AMG] ML cluster started \n"
            r1.append(r0)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
        L_0x0579:
            if (r24 > 0) goto L_0x00e8
        L_0x057b:
            X.1Av r8 = X.1Au.A00(r15)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            X.0xY r6 = X.AnonymousClass7TE.A0p(r8)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            java.lang.String r5 = "gallery_suggestion_complete_timestamps"
            r6.E5c(r5, r0)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r6.apply()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            X.0s0 r7 = r8.A6U     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            X.0YZ[] r12 = X.1Av.A8a     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r11 = 339(0x153, float:4.75E-43)
            r0 = r12[r11]     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            java.lang.Object r0 = r7.CDM(r8, r0)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            long r0 = X.AnonymousClass7TE.A0R(r0)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            long r9 = r9 - r0
            r5 = 5
            r0 = r22
            long r5 = r0.toMillis(r5)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x05ef
            X.7xb r0 = r4.A06     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            if (r0 == 0) goto L_0x05e2
            X.1VY r0 = r0.A00     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            X.1W6 r6 = r0.CGp()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r0 = r20
            X.0qQ.A0B(r6, r0)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            long r9 = X.AnonymousClass7TG.A0I()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r5 = r22
            r0 = r38
            long r0 = r5.toSeconds(r0)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            long r9 = r9 - r0
            java.lang.String r5 = "gallery_media_metadata"
            java.lang.String r1 = "date_sec < ?"
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ RuntimeException -> 0x05dc }
            java.lang.Long[] r0 = new java.lang.Long[]{r0}     // Catch:{ RuntimeException -> 0x05dc }
            r6.AON(r5, r1, r0)     // Catch:{ RuntimeException -> 0x05dc }
            goto L_0x05e2
        L_0x05dc:
            r1 = move-exception
            java.lang.String r0 = "GalleryMediaMetadataDatabaseAccessHelper#cleanupOldEntries"
            X.0wb.A07(r0, r1)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
        L_0x05e2:
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r1 = r12[r11]     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r7.Epx(r8, r0, r1)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
        L_0x05ef:
            X.9sP r0 = X.C391139sP.COMPLETED     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            r4.A01(r0)     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            goto L_0x00f1
        L_0x05f6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
            throw r0     // Catch:{ Exception -> 0x060b, OutOfMemoryError -> 0x05fb }
        L_0x05fb:
            r5 = move-exception
            java.lang.String r1 = "MediaScannerError"
            X.0sm r0 = X.0Yt.A0E()     // Catch:{ all -> 0x0630 }
            X.0kD.A0I(r1, r5, r0)     // Catch:{ all -> 0x0630 }
            X.9sP r0 = X.C391139sP.OOM     // Catch:{ all -> 0x0630 }
            r4.A01(r0)     // Catch:{ all -> 0x0630 }
            goto L_0x0629
        L_0x060b:
            r6 = move-exception
            X.5Eb r5 = r4.A0G     // Catch:{ all -> 0x0630 }
            java.lang.String r1 = "MediaScannerException: "
            java.lang.String r0 = r6.getLocalizedMessage()     // Catch:{ all -> 0x0630 }
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x0630 }
            r5.A00(r0)     // Catch:{ all -> 0x0630 }
            java.lang.String r1 = "MediaScannerException"
            X.0sm r0 = X.0Yt.A0E()     // Catch:{ all -> 0x0630 }
            X.0kD.A0I(r1, r6, r0)     // Catch:{ all -> 0x0630 }
            X.9sP r0 = X.C391139sP.EXCEPTION     // Catch:{ all -> 0x0630 }
            r4.A01(r0)     // Catch:{ all -> 0x0630 }
        L_0x0629:
            r4.A00()     // Catch:{ all -> 0x0630 }
        L_0x062c:
            r2.set(r3)
            return
        L_0x0630:
            r0 = move-exception
            r2.set(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40242AXg.A03():void");
    }

    public final void A04() {
        C391139sP r2 = C391139sP.STOPPED;
        synchronized (this) {
            if (this.A07 == null) {
                A01(r2);
            }
        }
    }
}
