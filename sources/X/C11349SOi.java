package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.models.IgModelLoader;
import com.facebook.smartcapture.docauth.CaptureState;
import com.facebook.smartcapture.docauth.DocAuthResult;
import com.facebook.smartcapture.download.CreditCardModulesDownloader;
import com.facebook.smartcapture.download.IgVoltronAndNmlModulesDownloader;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import java.lang.ref.WeakReference;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.SOi  reason: case insensitive filesystem */
public final class C11349SOi {
    public CreditCardModulesDownloader A00;
    public final C12276SqW A01;
    public final C12276SqW A02;
    public final C12274SqU A03 = new C12274SqU(this);
    public final C12275SqV A04 = new C12275SqV(this);
    public final IdCaptureLogger A05;
    public final WeakReference A06;
    public final Map A07;
    public final Map A08;
    public final WeakReference A09;
    public final Set A0A;

    public static final synchronized void A00(C11349SOi sOi) {
        C10240Rp0 rp0;
        synchronized (sOi) {
            if (sOi.A03() && (rp0 = (C10240Rp0) sOi.A09.get()) != null) {
                Map A0x = Pxf.A0x(sOi.A07);
                C12166SoH soH = rp0.A00;
                soH.A0A.initJNI(false, soH.A08, A0x);
                soH.A03();
            }
        }
    }

    public static final synchronized void A01(C11349SOi sOi) {
        synchronized (sOi) {
            Iterator it = sOi.A0A.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (sOi.A08.get((C8886REd) it.next()) == RE9.DOWNLOAD_IN_PROGRESS) {
                        break;
                    }
                } else {
                    C10240Rp0 rp0 = (C10240Rp0) sOi.A09.get();
                    if (rp0 != null) {
                        C12166SoH soH = rp0.A00;
                        soH.A04 = CaptureState.DOWNLOAD_FAILED;
                        C12166SoH.A01((DocAuthResult) null, soH, false);
                    }
                }
            }
        }
    }

    public final synchronized void A02() {
        CreditCardModulesDownloader creditCardModulesDownloader;
        synchronized (this) {
            for (C8886REd rEd : this.A0A) {
                Map map = this.A08;
                if (map.get(rEd) != RE9.AVAILABLE) {
                    if (!(((Context) this.A06.get()) == null || (creditCardModulesDownloader = this.A00) == null)) {
                        RE9 re9 = RE9.DOWNLOAD_IN_PROGRESS;
                        map.put(rEd, re9);
                        switch (rEd.ordinal()) {
                            case 0:
                                C12276SqW sqW = this.A02;
                                0qQ.A0B(sqW, 1);
                                sqW.DAH();
                                break;
                            case 1:
                                C12274SqU sqU = this.A03;
                                0qQ.A0B(sqU, 1);
                                08y r1 = 09i.A0A;
                                Bundle bundle = ((IgVoltronAndNmlModulesDownloader) creditCardModulesDownloader).A00;
                                0qQ.A0A(bundle);
                                IgModelLoader A002 = C363048j0.A00(r1.A04(bundle));
                                if (A002 == null) {
                                    0KC.A02(IgVoltronAndNmlModulesDownloader.class, "Failed to create ModelLoader");
                                    break;
                                } else {
                                    C255183ti.A04(new T0J(sqU, 6), A002.load("id_detector_pt", 1), 1Lf.A01);
                                    break;
                                }
                            case 2:
                                C12276SqW sqW2 = this.A01;
                                0qQ.A0B(sqW2, 1);
                                Integer num = AnonymousClass05K.A00;
                                08y r12 = 09i.A0A;
                                Bundle bundle2 = ((IgVoltronAndNmlModulesDownloader) creditCardModulesDownloader).A00;
                                0qQ.A0A(bundle2);
                                AnonymousClass0wW A042 = r12.A04(bundle2);
                                1RH A003 = 1RH.A00();
                                PyC pyC = new PyC(1US.A0K);
                                pyC.A03 = num;
                                pyC.A02 = new T82(sqW2, 3);
                                A003.A03(A042, new PyB(pyC));
                                break;
                            case 3:
                            case 4:
                            case 5:
                                RE9 re92 = (RE9) map.get(C8886REd.OCR_DETECTOR_MODEL);
                                RE9 re93 = (RE9) map.get(C8886REd.OCR_RECOGNIZER_MODEL);
                                RE9 re94 = (RE9) map.get(C8886REd.OCR_CONFIGURATION);
                                if (re92 != re9 || re93 != re9 || re94 != re9) {
                                    C12275SqV sqV = this.A04;
                                    0qQ.A0B(sqV, 1);
                                    08y r13 = 09i.A0A;
                                    Bundle bundle3 = ((IgVoltronAndNmlModulesDownloader) creditCardModulesDownloader).A00;
                                    0qQ.A0A(bundle3);
                                    IgModelLoader A004 = C363048j0.A00(r13.A04(bundle3));
                                    if (A004 == null) {
                                        0KC.A02(IgVoltronAndNmlModulesDownloader.class, "Failed to create ModelLoader");
                                        break;
                                    } else {
                                        C255183ti.A04(new T0J(sqV, 7), A004.load("ocr2go_credit_card_models", 2), 1Lf.A01);
                                        break;
                                    }
                                } else {
                                    break;
                                }
                        }
                    }
                }
            }
        }
    }

    public final synchronized boolean A03() {
        boolean z;
        Iterator it = this.A0A.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            if (((RE9) this.A08.get((C8886REd) it.next())) != RE9.AVAILABLE) {
                z = false;
                break;
            }
        }
        return z;
    }

    public C11349SOi(Context context, IdCaptureLogger idCaptureLogger, C10240Rp0 rp0, boolean z) {
        EnumSet of;
        this.A05 = idCaptureLogger;
        this.A06 = C51965G9l.A0v(context);
        Class<C8886REd> cls = C8886REd.class;
        this.A08 = new EnumMap(cls);
        this.A07 = new EnumMap(cls);
        this.A09 = C51965G9l.A0v(rp0);
        C8886REd rEd = C8886REd.ID_DETECTOR_BINARY;
        this.A02 = new C12276SqW(rEd, this);
        C8886REd rEd2 = C8886REd.CREDIT_CARD_BINARY;
        this.A01 = new C12276SqW(rEd2, this);
        if (z) {
            of = EnumSet.of(C8886REd.ID_DETECTOR_MODEL, rEd2, C8886REd.OCR_DETECTOR_MODEL, C8886REd.OCR_RECOGNIZER_MODEL, C8886REd.OCR_CONFIGURATION);
        } else {
            of = EnumSet.of(rEd, C8886REd.ID_DETECTOR_MODEL);
        }
        0qQ.A0A(of);
        this.A0A = of;
    }
}
