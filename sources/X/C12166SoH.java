package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.smartcapture.diagnostic.DiagnosticInfo;
import com.facebook.smartcapture.docauth.CaptureState;
import com.facebook.smartcapture.docauth.CreditCardScannerResult;
import com.facebook.smartcapture.docauth.DocAuthManager;
import com.facebook.smartcapture.docauth.DocAuthManagerDelegate;
import com.facebook.smartcapture.docauth.DocAuthResult;
import com.facebook.smartcapture.docauth.DocumentType;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import com.facebook.smartcapture.logging.FederatedAnalyticsCardData;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import com.facebook.smartcapture.logging.IdCaptureStep;
import com.facebook.smartcapture.logging.InMemoryLogger;
import com.facebook.smartcapture.view.IdCaptureActivity;
import com.facebook.smartcapture.view.IdCaptureBaseActivity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.SoH  reason: case insensitive filesystem */
public final class C12166SoH implements C364018kj, DocAuthManagerDelegate {
    public int A00;
    public int A01;
    public long A02;
    public C8878RDv A03;
    public CaptureState A04;
    public DocumentType A05;
    public C10745RxO A06;
    public boolean A07;
    public boolean A08;
    public Point[] A09;
    public final DocAuthManager A0A;
    public final DocumentType A0B;
    public final C11349SOi A0C;
    public final IdCaptureConfig A0D;
    public final IdCaptureLogger A0E;
    public final InMemoryLogger A0F;
    public final Q8T A0G;
    public final C10239Roz A0H = new C10239Roz(this);
    public final String A0I;
    public final WeakReference A0J;
    public final WeakReference A0K;
    public final Map A0L;
    public final Handler A0M = AnonymousClass7TF.A0D();
    public final C10240Rp0 A0N;

    public C12166SoH(Context context, DocAuthManager docAuthManager, DocumentType documentType, IdCaptureConfig idCaptureConfig, IdCaptureLogger idCaptureLogger, C13777Tgs tgs, C9866Rif rif) {
        0qQ.A0B(documentType, 5);
        this.A0D = idCaptureConfig;
        this.A0J = C51965G9l.A0v(context);
        this.A0B = documentType;
        this.A0K = C51965G9l.A0v(tgs);
        this.A0A = docAuthManager;
        CaptureState captureState = CaptureState.INITIAL;
        this.A04 = captureState;
        C10240Rp0 rp0 = new C10240Rp0(this);
        this.A0N = rp0;
        docAuthManager.setDelegate(this);
        this.A0E = idCaptureLogger;
        this.A0I = AnonymousClass7TG.A0j();
        this.A0F = new InMemoryLogger(idCaptureLogger);
        this.A0L = AnonymousClass7TE.A1E();
        this.A03 = C8878RDv.ID_FRONT_SIDE;
        this.A04 = captureState;
        boolean z = idCaptureConfig.A0I;
        if (z || idCaptureConfig.A01().A00 < 2) {
            this.A06 = null;
        } else {
            this.A06 = new C10745RxO();
        }
        this.A0G = new Q8T(context, this);
        C11349SOi sOi = new C11349SOi(context, idCaptureLogger, rp0, z);
        this.A0C = sOi;
        boolean z2 = false;
        if (rif != null) {
            0qQ.A07(idCaptureConfig.A0E);
            if (z) {
                z2 = true;
            }
        } else {
            z2 = z;
        }
        this.A08 = z2;
        if (z2) {
            sOi.A00 = idCaptureConfig.A06;
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [com.facebook.smartcapture.view.IdCaptureActivity, android.app.Activity] */
    public final void DCn(Exception exc) {
        0qQ.A0B(exc, 0);
        this.A0E.logError("Photo save error", exc);
        C13777Tgs tgs = (C13777Tgs) this.A0K.get();
        if (tgs != null) {
            ? r1 = (IdCaptureActivity) tgs;
            r1.runOnUiThread(new C12906TCu(r1));
        }
    }

    public final void DX5(C363858kS r5) {
        0qQ.A0B(r5, 0);
        XtE.A00(new C13158TNq(1, r5, this)).A05(new C11767SgD(this, 1), XtE.A0A);
    }

    public final /* synthetic */ void DaE(float f) {
    }

    public final void DsK(C363858kS r1) {
    }

    public final void onDocAuthResultAvailable(DocAuthResult docAuthResult, int i) {
        CaptureState captureState;
        0qQ.A0B(docAuthResult, 0);
        CaptureState captureState2 = this.A04;
        if (captureState2 != CaptureState.MANUAL_CAPTURE && captureState2 != CaptureState.CAPTURING_MANUAL && captureState2 != CaptureState.CAPTURING_AUTOMATIC) {
            Point[] pointArr = docAuthResult.detectedCorners;
            if (pointArr != null) {
                0sC r2 = new 0sC(pointArr);
                while (true) {
                    if (!r2.hasNext()) {
                        this.A09 = docAuthResult.detectedCorners;
                        break;
                    }
                    Point point = (Point) r2.next();
                    if (point.x == 0 && point.y == 0) {
                        break;
                    }
                }
            }
            if (!docAuthResult.isFound) {
                captureState = CaptureState.ID_TYPE_DETECTION;
            } else {
                if (docAuthResult.isAligned) {
                    if (docAuthResult.isBlurry) {
                        captureState = CaptureState.BLUR_DETECTED;
                    } else if (docAuthResult._hasGlare) {
                        captureState = CaptureState.GLARE_DETECTED;
                    } else if (this.A0D.A0I) {
                        CreditCardScannerResult creditCardScannerResult = docAuthResult.creditCardScannerResult;
                        if (creditCardScannerResult == null || !creditCardScannerResult.isFound) {
                            captureState = CaptureState.SCANNING_CREDIT_CARD;
                        } else {
                            captureState = CaptureState.CREDIT_CARD_SCANNED;
                        }
                    } else if (this.A07 && SystemClock.elapsedRealtime() - this.A02 >= 800) {
                        if (this.A06 != null) {
                            captureState = CaptureState.HOLDING_STEADY;
                        } else {
                            captureState = CaptureState.CAPTURING_AUTOMATIC;
                        }
                    }
                }
                captureState = CaptureState.ID_FOUND;
            }
            if (captureState != this.A04) {
                this.A04 = captureState;
                A01(docAuthResult, this, true);
            }
        }
    }

    private final void A00(DocAuthResult docAuthResult) {
        DocAuthResult docAuthResult2 = docAuthResult;
        CreditCardScannerResult creditCardScannerResult = docAuthResult2.creditCardScannerResult;
        if (creditCardScannerResult != null) {
            this.A0E.logFederatedAnalyticsCardData(new FederatedAnalyticsCardData(this.A0I, creditCardScannerResult.isFound, creditCardScannerResult.number, creditCardScannerResult.expiryDate, creditCardScannerResult.name, docAuthResult2.detectedCorners, false, creditCardScannerResult.processingTime, creditCardScannerResult.ocrResult, creditCardScannerResult.digitOcrResult, creditCardScannerResult.textOcrResult, creditCardScannerResult.mergedOcrResult));
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [android.content.Context, java.lang.Object, com.facebook.smartcapture.view.IdCaptureActivity, com.facebook.smartcapture.view.IdCaptureBaseActivity, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        X.C66581MXm.A0A((android.app.Activity) r4).post(new X.C13028TIk(r5, r13, r14));
        r13.A05 = r5;
        r1 = r13.A04;
        r6 = r13.A03;
        X.0qQ.A0B(r6, 1);
        r5 = ((com.facebook.smartcapture.view.IdCaptureActivity) r4).A04;
        X.0qQ.A0A(r5);
        r5 = (X.C7913Qcj) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02e6, code lost:
        X.0qQ.A0F("presenter");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02f0, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0058, code lost:
        switch(r1.ordinal()) {
            case 1: goto L_0x0073;
            case 2: goto L_0x005b;
            case 3: goto L_0x0087;
            case 4: goto L_0x0087;
            case 5: goto L_0x0077;
            case 6: goto L_0x007b;
            case 7: goto L_0x0087;
            case 8: goto L_0x006f;
            case 9: goto L_0x007f;
            case 10: goto L_0x007f;
            case 11: goto L_0x0083;
            case com.instagram.react.modules.base.IgReactQEModule.CONFIG_KEY_OFFSET :int: goto L_0x0083;
            default: goto L_0x005b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005f, code lost:
        if (r13.A04 != com.facebook.smartcapture.docauth.CaptureState.HOLDING_STEADY) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0061, code lost:
        r0 = r13.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0063, code lost:
        if (r0 == null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        if (r0.A02 != true) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        r4.ElM(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        r1 = com.instagram.android.R.string.f0nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        r1 = com.instagram.android.R.string.f0nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        r1 = com.instagram.android.R.string.f0nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
        r1 = com.instagram.android.R.string.f0nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        r1 = com.instagram.android.R.string.f0nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        r1 = com.instagram.android.R.string.f0nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0089, code lost:
        if (r5.A04 == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
        r1 = com.instagram.android.R.string.f0nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
        if (r5.isAdded() == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0094, code lost:
        r2 = r5.getText(r1);
        X.0qQ.A07(r2);
        r1 = r5.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        if (r1 == null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        r1.post(new X.TGT(r5, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ac, code lost:
        if (r5.A00 != X.RE7.A04) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ae, code lost:
        r0 = r6.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b2, code lost:
        if (r0 == 0) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b4, code lost:
        r1 = com.instagram.android.R.string.f0nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b7, code lost:
        if (r0 == 1) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b9, code lost:
        r1 = com.instagram.android.R.string.f0nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bd, code lost:
        r1 = com.instagram.android.R.string.f0nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c3, code lost:
        if (r1 != com.facebook.smartcapture.docauth.CaptureState.CAPTURING_AUTOMATIC) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c5, code lost:
        r5 = r13.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c7, code lost:
        if (r5 != null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c9, code lost:
        r5 = r13.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0024, code lost:
        r1 = r13.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0126, code lost:
        r13.A0J.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
        if (r1 == com.facebook.smartcapture.docauth.CaptureState.MANUAL_CAPTURE) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r1 == com.facebook.smartcapture.docauth.CaptureState.ID_TYPE_DETECTION) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r12 == null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        r5 = r12.documentType;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.facebook.smartcapture.docauth.DocAuthResult r12, X.C12166SoH r13, boolean r14) {
        /*
            java.lang.ref.WeakReference r0 = r13.A0K
            java.lang.Object r4 = r0.get()
            X.Tgs r4 = (X.C13777Tgs) r4
            if (r4 == 0) goto L_0x006c
            com.facebook.smartcapture.logging.InMemoryLogger r8 = r13.A0F
            com.facebook.smartcapture.docauth.CaptureState r0 = r13.A04
            java.lang.String r0 = r0.getText()
            com.facebook.smartcapture.logging.InMemoryLogger$LogEntryBuilder r0 = r8.addEntry(r0)
            r0.submit()
            com.facebook.smartcapture.docauth.CaptureState r0 = r13.A04
            int r0 = r0.ordinal()
            r3 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L_0x029c;
                case 2: goto L_0x012d;
                case 3: goto L_0x00e9;
                case 4: goto L_0x011a;
                case 5: goto L_0x02de;
                case 6: goto L_0x02de;
                case 7: goto L_0x0102;
                case 8: goto L_0x0024;
                case 9: goto L_0x0167;
                case 10: goto L_0x0172;
                case 11: goto L_0x00cd;
                case 12: goto L_0x00cd;
                default: goto L_0x0024;
            }
        L_0x0024:
            com.facebook.smartcapture.docauth.CaptureState r1 = r13.A04
            com.facebook.smartcapture.docauth.CaptureState r0 = com.facebook.smartcapture.docauth.CaptureState.MANUAL_CAPTURE
            if (r1 == r0) goto L_0x00c1
            com.facebook.smartcapture.docauth.CaptureState r0 = com.facebook.smartcapture.docauth.CaptureState.ID_TYPE_DETECTION
            if (r1 == r0) goto L_0x00c1
            if (r12 == 0) goto L_0x00c1
            com.facebook.smartcapture.docauth.DocumentType r5 = r12.documentType
        L_0x0032:
            X.TIk r1 = new X.TIk
            r1.<init>(r5, r13, r14)
            r0 = r4
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.View r0 = X.C66581MXm.A0A(r0)
            r0.post(r1)
            r13.A05 = r5
            com.facebook.smartcapture.docauth.CaptureState r1 = r13.A04
            X.RDv r6 = r13.A03
            r0 = r4
            com.facebook.smartcapture.view.IdCaptureActivity r0 = (com.facebook.smartcapture.view.IdCaptureActivity) r0
            X.0qQ.A0B(r6, r3)
            X.Qcm r5 = r0.A04
            X.0qQ.A0A(r5)
            X.Qcj r5 = (X.C7913Qcj) r5
            int r0 = r1.ordinal()
            switch(r0) {
                case 1: goto L_0x0073;
                case 2: goto L_0x005b;
                case 3: goto L_0x0087;
                case 4: goto L_0x0087;
                case 5: goto L_0x0077;
                case 6: goto L_0x007b;
                case 7: goto L_0x0087;
                case 8: goto L_0x006f;
                case 9: goto L_0x007f;
                case 10: goto L_0x007f;
                case 11: goto L_0x0083;
                case 12: goto L_0x0083;
                default: goto L_0x005b;
            }
        L_0x005b:
            com.facebook.smartcapture.docauth.CaptureState r1 = r13.A04
            com.facebook.smartcapture.docauth.CaptureState r0 = com.facebook.smartcapture.docauth.CaptureState.HOLDING_STEADY
            if (r1 != r0) goto L_0x006d
            X.RxO r0 = r13.A06
            if (r0 == 0) goto L_0x006d
            boolean r0 = r0.A02
            if (r0 != r3) goto L_0x006d
        L_0x0069:
            r4.ElM(r3)
        L_0x006c:
            return
        L_0x006d:
            r3 = 0
            goto L_0x0069
        L_0x006f:
            r1 = 2131951931(0x7f13013b, float:1.954029E38)
            goto L_0x008e
        L_0x0073:
            r1 = 2131951934(0x7f13013e, float:1.9540297E38)
            goto L_0x008e
        L_0x0077:
            r1 = 2131951927(0x7f130137, float:1.9540282E38)
            goto L_0x008e
        L_0x007b:
            r1 = 2131951926(0x7f130136, float:1.954028E38)
            goto L_0x008e
        L_0x007f:
            r1 = 2131951936(0x7f130140, float:1.95403E38)
            goto L_0x008e
        L_0x0083:
            r1 = 2131951938(0x7f130142, float:1.9540305E38)
            goto L_0x008e
        L_0x0087:
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x00a8
            r1 = 2131951922(0x7f130132, float:1.9540272E38)
        L_0x008e:
            boolean r0 = r5.isAdded()
            if (r0 == 0) goto L_0x005b
            java.lang.CharSequence r2 = r5.getText(r1)
            X.0qQ.A07(r2)
            com.facebook.smartcapture.components.ContourView r1 = r5.A0A
            if (r1 == 0) goto L_0x005b
            X.TGT r0 = new X.TGT
            r0.<init>(r5, r2)
            r1.post(r0)
            goto L_0x005b
        L_0x00a8:
            X.RE7 r1 = r5.A00
            X.RE7 r0 = X.RE7.TWO_SIDES
            if (r1 != r0) goto L_0x00b9
            int r0 = r6.ordinal()
            if (r0 == r2) goto L_0x00bd
            r1 = 2131951921(0x7f130131, float:1.954027E38)
            if (r0 == r3) goto L_0x008e
        L_0x00b9:
            r1 = 2131951924(0x7f130134, float:1.9540276E38)
            goto L_0x008e
        L_0x00bd:
            r1 = 2131951923(0x7f130133, float:1.9540274E38)
            goto L_0x008e
        L_0x00c1:
            com.facebook.smartcapture.docauth.CaptureState r0 = com.facebook.smartcapture.docauth.CaptureState.CAPTURING_AUTOMATIC
            if (r1 != r0) goto L_0x00c9
            com.facebook.smartcapture.docauth.DocumentType r5 = r13.A05
            if (r5 != 0) goto L_0x0032
        L_0x00c9:
            com.facebook.smartcapture.docauth.DocumentType r5 = r13.A0B
            goto L_0x0032
        L_0x00cd:
            r0 = r4
            com.facebook.smartcapture.view.IdCaptureActivity r0 = (com.facebook.smartcapture.view.IdCaptureActivity) r0
            X.Ti8 r1 = r0.A02
            if (r1 == 0) goto L_0x02e2
            X.SoH r0 = r0.A03
            if (r0 == 0) goto L_0x02e6
            boolean r0 = r1.EzX(r0)
            if (r0 == 0) goto L_0x02e2
            r4.ElL(r2, r14)
            r13.A07 = r2
            com.facebook.smartcapture.docauth.DocAuthManager r0 = r13.A0A
            r0.isImageProcessingRunning = r2
            goto L_0x0024
        L_0x00e9:
            r0 = r4
            com.facebook.smartcapture.view.IdCaptureActivity r0 = (com.facebook.smartcapture.view.IdCaptureActivity) r0
            X.Ti8 r0 = r0.A02
            X.0qQ.A0A(r0)
            r0.EQS(r2)
            r4.EUV(r2)
            r4.ElL(r3, r14)
            r13.A07 = r2
            com.facebook.smartcapture.docauth.DocAuthManager r0 = r13.A0A
            r0.isImageProcessingRunning = r3
            goto L_0x0024
        L_0x0102:
            r0 = r4
            com.facebook.smartcapture.view.IdCaptureActivity r0 = (com.facebook.smartcapture.view.IdCaptureActivity) r0
            X.Ti8 r0 = r0.A02
            X.0qQ.A0A(r0)
            r0.EQS(r2)
            r4.EUV(r2)
            r4.ElL(r3, r14)
            r13.A07 = r2
            com.facebook.smartcapture.docauth.DocAuthManager r0 = r13.A0A
            r0.isImageProcessingRunning = r2
            goto L_0x0126
        L_0x011a:
            boolean r0 = r13.A07
            if (r0 != 0) goto L_0x0126
            r13.A07 = r3
            long r0 = android.os.SystemClock.elapsedRealtime()
            r13.A02 = r0
        L_0x0126:
            java.lang.ref.WeakReference r0 = r13.A0J
            r0.get()
            goto L_0x0024
        L_0x012d:
            r5 = 4
            r1 = r4
            com.facebook.smartcapture.view.IdCaptureActivity r1 = (com.facebook.smartcapture.view.IdCaptureActivity) r1
            X.Ti8 r0 = r1.A02
            X.0qQ.A0A(r0)
            r0.EQS(r5)
            r4.EUV(r2)
            X.Qcm r5 = r1.A04
            X.0qQ.A0A(r5)
            X.Qcj r5 = (X.C7913Qcj) r5
            r1 = 8
            com.facebook.smartcapture.components.ContourView r0 = r5.A0A
            X.0qQ.A0A(r0)
            r0.setVisibility(r1)
            android.widget.ImageButton r0 = r5.A03
            X.0qQ.A0A(r0)
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r5.A07
            X.0qQ.A0A(r0)
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r5.A05
            X.0qQ.A0A(r0)
            r0.setVisibility(r2)
            goto L_0x0024
        L_0x0167:
            if (r12 == 0) goto L_0x0024
            com.facebook.smartcapture.docauth.CreditCardScannerResult r0 = r12.creditCardScannerResult
            if (r0 == 0) goto L_0x0024
            r13.A00(r12)
            goto L_0x0024
        L_0x0172:
            com.facebook.smartcapture.docauth.DocAuthManager r0 = r13.A0A
            r0.isImageProcessingRunning = r2
            if (r12 == 0) goto L_0x0024
            com.facebook.smartcapture.docauth.CreditCardScannerResult r7 = r12.creditCardScannerResult
            if (r7 == 0) goto L_0x0024
            r6 = r4
            com.facebook.smartcapture.view.IdCaptureActivity r6 = (com.facebook.smartcapture.view.IdCaptureActivity) r6
            X.Qcm r5 = r6.A04
            X.0qQ.A0A(r5)
            X.Qcj r5 = (X.C7913Qcj) r5
            android.widget.TextView r1 = r5.A09
            X.0qQ.A0A(r1)
            X.TGQ r0 = new X.TGQ
            r0.<init>(r7, r5)
            r1.post(r0)
            com.facebook.smartcapture.flow.IdCaptureConfig r0 = r6.A01()
            java.lang.String r1 = r0.A0F
            com.facebook.smartcapture.logging.IdCaptureLogger r10 = r6.A02()
            java.lang.String r9 = "Error in generating RSA public key"
            r5 = 0
            if (r1 == 0) goto L_0x01bd
            r0 = 2
            byte[] r0 = android.util.Base64.decode(r1, r0)
            java.security.spec.X509EncodedKeySpec r1 = new java.security.spec.X509EncodedKeySpec
            r1.<init>(r0)
            java.lang.String r0 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0)     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x01b9 }
            if (r0 == 0) goto L_0x01bd
            java.security.PublicKey r5 = r0.generatePublic(r1)     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x01b9 }
            goto L_0x01bd
        L_0x01b9:
            r0 = move-exception
            r10.logError(r9, r0)
        L_0x01bd:
            java.lang.String r1 = r7.number
            com.facebook.smartcapture.logging.IdCaptureLogger r0 = r6.A02()
            java.lang.String r11 = X.C9582RdM.A00(r0, r1, r5)
            java.lang.String r1 = r7.name
            com.facebook.smartcapture.logging.IdCaptureLogger r0 = r6.A02()
            java.lang.String r10 = X.C9582RdM.A00(r0, r1, r5)
            java.lang.String r1 = r7.expiryDate
            com.facebook.smartcapture.logging.IdCaptureLogger r0 = r6.A02()
            java.lang.String r9 = X.C9582RdM.A00(r0, r1, r5)
            java.lang.String r1 = r7.issueDate
            com.facebook.smartcapture.logging.IdCaptureLogger r0 = r6.A02()
            java.lang.String r1 = X.C9582RdM.A00(r0, r1, r5)
            if (r11 != 0) goto L_0x0265
            com.facebook.smartcapture.flow.IdCaptureConfig r0 = r6.A01()
            int r1 = r0.A00
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r6, r1)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r0)
            r0 = 2131972728(0x7f135278, float:1.9582472E38)
            android.app.AlertDialog$Builder r5 = r1.setTitle(r0)
            r1 = 2131972729(0x7f135279, float:1.9582474E38)
            r0 = 0
            android.app.AlertDialog$Builder r1 = r5.setPositiveButton(r1, r0)
            X.SVF r0 = new X.SVF
            r0.<init>(r6, r3)
            android.app.AlertDialog$Builder r0 = r1.setOnDismissListener(r0)
            r0.show()
        L_0x0212:
            r13.A00(r12)
            java.lang.String r0 = "parsed_credit_card_fields"
            com.facebook.smartcapture.logging.InMemoryLogger$LogEntryBuilder r5 = r8.addEntry(r0)
            java.lang.String r0 = r7.number
            r1 = 1
            if (r0 == 0) goto L_0x0227
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0228
        L_0x0227:
            r1 = 0
        L_0x0228:
            java.lang.String r0 = "credit_card_number"
            r5.put((java.lang.String) r0, (boolean) r1)
            java.lang.String r0 = r7.name
            r1 = 1
            if (r0 == 0) goto L_0x0238
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0239
        L_0x0238:
            r1 = 0
        L_0x0239:
            java.lang.String r0 = "credit_card_name"
            r5.put((java.lang.String) r0, (boolean) r1)
            java.lang.String r0 = r7.expiryDate
            r1 = 1
            if (r0 == 0) goto L_0x0249
            int r0 = r0.length()
            if (r0 != 0) goto L_0x024a
        L_0x0249:
            r1 = 0
        L_0x024a:
            java.lang.String r0 = "credit_card_expiry_date"
            r5.put((java.lang.String) r0, (boolean) r1)
            java.lang.String r0 = r7.issueDate
            r1 = 1
            if (r0 == 0) goto L_0x025a
            int r0 = r0.length()
            if (r0 != 0) goto L_0x025b
        L_0x025a:
            r1 = 0
        L_0x025b:
            java.lang.String r0 = "credit_card_issue_date"
            r5.put((java.lang.String) r0, (boolean) r1)
            r5.submit()
            goto L_0x0024
        L_0x0265:
            android.content.Intent r5 = X.DbS.A09()
            java.lang.String r0 = "credit_card_number"
            r5.putExtra(r0, r11)
            java.lang.String r0 = "credit_card_name"
            r5.putExtra(r0, r10)
            java.lang.String r0 = "credit_card_expiry_date"
            r5.putExtra(r0, r9)
            java.lang.String r0 = "credit_card_issue_date"
            r5.putExtra(r0, r1)
            X.SoH r0 = r6.A03
            if (r0 == 0) goto L_0x02e6
            java.lang.String r1 = r0.A0I
            java.lang.String r0 = "card_scanner_session_id"
            r5.putExtra(r0, r1)
            r0 = -1
            r6.setResult(r0, r5)
            X.TCt r9 = new X.TCt
            r9.<init>(r6)
            r0 = 1500(0x5dc, double:7.41E-321)
            android.view.View r5 = X.C66581MXm.A0A(r6)
            r5.postDelayed(r9, r0)
            goto L_0x0212
        L_0x029c:
            r4.ElL(r2, r14)
            com.facebook.smartcapture.docauth.DocAuthManager r0 = r13.A0A
            r0.isImageProcessingRunning = r2
            r5 = 4
            r1 = r4
            com.facebook.smartcapture.view.IdCaptureActivity r1 = (com.facebook.smartcapture.view.IdCaptureActivity) r1
            X.Ti8 r0 = r1.A02
            X.0qQ.A0A(r0)
            r0.EQS(r5)
            r4.EUV(r3)
            X.Qcm r5 = r1.A04
            X.0qQ.A0A(r5)
            X.Qcj r5 = (X.C7913Qcj) r5
            r1 = 8
            com.facebook.smartcapture.components.ContourView r0 = r5.A0A
            X.0qQ.A0A(r0)
            r0.setVisibility(r2)
            android.widget.LinearLayout r0 = r5.A05
            X.0qQ.A0A(r0)
            r0.setVisibility(r1)
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x02d7
            android.widget.ImageButton r0 = r5.A03
            X.0qQ.A0A(r0)
            r0.setVisibility(r2)
        L_0x02d7:
            X.SOi r0 = r13.A0C
            r0.A02()
            goto L_0x0024
        L_0x02de:
            r13.A07 = r2
            goto L_0x0024
        L_0x02e2:
            r13.A03()
            return
        L_0x02e6:
            java.lang.String r0 = "presenter"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12166SoH.A01(com.facebook.smartcapture.docauth.DocAuthResult, X.SoH, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [com.facebook.smartcapture.view.IdCaptureActivity, com.facebook.smartcapture.view.IdCaptureBaseActivity, android.app.Activity] */
    public final void A02() {
        RE7 A002 = this.A0D.A00();
        0qQ.A07(A002);
        C13777Tgs tgs = (C13777Tgs) this.A0K.get();
        if (tgs == null) {
            return;
        }
        if (this.A03 == C8878RDv.ID_FRONT_SIDE && A002 == RE7.TWO_SIDES) {
            this.A03 = C8878RDv.ID_BACK_SIDE;
            IdCaptureBaseActivity idCaptureBaseActivity = (IdCaptureBaseActivity) tgs;
            idCaptureBaseActivity.A05 = IdCaptureStep.FIRST_PHOTO_CONFIRMATION;
            idCaptureBaseActivity.A02().logStepChange(idCaptureBaseActivity.A05, IdCaptureStep.SECOND_PHOTO_CAPTURE);
            return;
        }
        ? r4 = (IdCaptureActivity) tgs;
        Intent A092 = DbS.A09();
        A092.setData(r4.A00);
        C12166SoH soH = r4.A03;
        if (soH == null) {
            0qQ.A0F("presenter");
            throw AnonymousClass00P.createAndThrow();
        }
        Map A0x = Pxf.A0x(soH.A0L);
        A092.putExtra("front_file_path", r4.A01().A0C);
        A092.putExtra("front_authenticity_upload_medium", (Serializable) A0x.get(RE6.ID_FRONT));
        RE7 A003 = r4.A01().A00();
        0qQ.A07(A003);
        RE6 re6 = RE6.ID_BACK;
        if (A003 == RE7.TWO_SIDES) {
            A092.putExtra("back_file_path", r4.A01().A0B);
            A092.putExtra("back_authenticity_upload_medium", (Serializable) A0x.get(re6));
        }
        Dba.A0k(r4, A092);
        r4.A02().logFlowEnd();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r1 != com.facebook.smartcapture.docauth.CaptureState.DOWNLOAD_FAILED) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r4 = this;
            com.facebook.smartcapture.flow.IdCaptureConfig r0 = r4.A0D
            X.RF2 r1 = r0.A01()
            X.RF2 r0 = X.RF2.LOW_END
            r3 = 0
            boolean r2 = X.AnonymousClass7TF.A1W(r1, r0)
            com.facebook.smartcapture.docauth.CaptureState r1 = r4.A04
            com.facebook.smartcapture.docauth.CaptureState r0 = com.facebook.smartcapture.docauth.CaptureState.INITIAL
            if (r1 == r0) goto L_0x002e
            com.facebook.smartcapture.docauth.CaptureState r0 = com.facebook.smartcapture.docauth.CaptureState.DOWNLOADING_DEPS
            if (r1 == r0) goto L_0x002e
            com.facebook.smartcapture.docauth.CaptureState r0 = com.facebook.smartcapture.docauth.CaptureState.MANUAL_CAPTURE
            if (r1 == r0) goto L_0x003d
            com.facebook.smartcapture.docauth.CaptureState r0 = com.facebook.smartcapture.docauth.CaptureState.CAPTURING_MANUAL
            if (r1 == r0) goto L_0x003d
            com.facebook.smartcapture.docauth.CaptureState r0 = com.facebook.smartcapture.docauth.CaptureState.DOWNLOAD_FAILED
            if (r1 == r0) goto L_0x0027
        L_0x0023:
            com.facebook.smartcapture.docauth.CaptureState r0 = com.facebook.smartcapture.docauth.CaptureState.ID_TYPE_DETECTION
        L_0x0025:
            r4.A04 = r0
        L_0x0027:
            r4.A07 = r3
            r0 = 0
            A01(r0, r4, r3)
            return
        L_0x002e:
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x003d
            X.SOi r0 = r4.A0C
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x003d
            com.facebook.smartcapture.docauth.CaptureState r0 = com.facebook.smartcapture.docauth.CaptureState.DOWNLOADING_DEPS
            goto L_0x0025
        L_0x003d:
            if (r2 == 0) goto L_0x0023
            com.facebook.smartcapture.docauth.CaptureState r0 = com.facebook.smartcapture.docauth.CaptureState.MANUAL_CAPTURE
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12166SoH.A03():void");
    }

    public final void D16() {
        this.A01 = this.A00;
    }

    public final void onDiagnosticInfoAvailable(DiagnosticInfo diagnosticInfo) {
        if (this.A0K.get() != null) {
            0qQ.A0A((Object) null);
            0qQ.A0A(diagnosticInfo);
            throw AnonymousClass7TE.A11("setDiagnosticInfo");
        }
    }
}
