package X;

import java.security.GeneralSecurityException;

/* renamed from: X.9Ad  reason: invalid class name and case insensitive filesystem */
public abstract class C374619Ad {
    public static final AnonymousClass98B A00;
    public static final C3739897s A01 = new C3739897s(new C374659Ah(), C374609Ac.class);
    public static final AnonymousClass987 A02;
    public static final AnonymousClass984 A03 = new AnonymousClass984(new C374629Ae(), C374639Af.class);
    public static final C3740497y A04;

    static {
        C3740497y A012 = C3740397x.A01("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        A04 = A012;
        A02 = new AnonymousClass987(new C374649Ag(), A012);
        A00 = new AnonymousClass98B(new C374669Ai(), A012);
    }

    public static C374639Af A00(C384429hJ r4, AnonymousClass98D r5) {
        C39882ADe aDe;
        C39881ADd aDd;
        C384459hM r2 = C384459hM.DEFAULT_INSTANCE;
        C384319h8 r1 = (C384319h8) r2.A0C();
        C384459hM r0 = r4.dekTemplate_;
        if (r0 == null) {
            r0 = r2;
        }
        r1.A06(r0.typeUrl_);
        C384459hM r02 = r4.dekTemplate_;
        if (r02 == null) {
            r02 = r2;
        }
        r1.A05(r02.value_);
        r1.A04(AnonymousClass98D.RAW);
        AnonymousClass983 A002 = AAL.A00(r1.A01().A0B());
        if (A002 instanceof C3743299a) {
            aDe = C39882ADe.A03;
        } else if (A002 instanceof C3744099i) {
            aDe = C39882ADe.A05;
        } else if (A002 instanceof C3744299k) {
            aDe = C39882ADe.A06;
        } else if (A002 instanceof AnonymousClass99S) {
            aDe = C39882ADe.A01;
        } else if (A002 instanceof C3743599d) {
            aDe = C39882ADe.A02;
        } else if (A002 instanceof AnonymousClass9AB) {
            aDe = C39882ADe.A04;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported DEK parameters when parsing ");
            sb.append(A002);
            throw new GeneralSecurityException(sb.toString());
        }
        int ordinal = r5.ordinal();
        if (ordinal == 1) {
            aDd = C39881ADd.A02;
        } else if (ordinal == 3) {
            aDd = C39881ADd.A01;
        } else {
            throw new GeneralSecurityException(002.A0O("Unable to parse OutputPrefixType: ", r5.A01()));
        }
        String str = r4.kekUri_;
        AnonymousClass99T r22 = (AnonymousClass99T) A002;
        if (str == null) {
            throw new GeneralSecurityException("kekUri must be set");
        } else if (r22 == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        } else if (r22.A00()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        } else if ((aDe.equals(C39882ADe.A03) && (r22 instanceof C3743299a)) || ((aDe.equals(C39882ADe.A05) && (r22 instanceof C3744099i)) || ((aDe.equals(C39882ADe.A06) && (r22 instanceof C3744299k)) || ((aDe.equals(C39882ADe.A01) && (r22 instanceof AnonymousClass99S)) || ((aDe.equals(C39882ADe.A02) && (r22 instanceof C3743599d)) || (aDe.equals(C39882ADe.A04) && (r22 instanceof AnonymousClass9AB))))))) {
            return new C374639Af(r22, aDe, aDd, str);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot use parsing strategy ");
            sb2.append(aDe.toString());
            sb2.append(" when new keys are picked according to ");
            sb2.append(r22);
            sb2.append(".");
            throw new GeneralSecurityException(sb2.toString());
        }
    }

    public static C384429hJ A01(C374639Af r4) {
        try {
            C384459hM r3 = (C384459hM) AnonymousClass972.A02(C3738397d.A00(), C384459hM.DEFAULT_INSTANCE, AAL.A01(r4.A00));
            C375269Cx A0C = C384429hJ.DEFAULT_INSTANCE.A0C();
            String str = r4.A02;
            A0C.A03();
            str.getClass();
            ((C384429hJ) A0C.A00).kekUri_ = str;
            A0C.A03();
            C384429hJ r1 = (C384429hJ) A0C.A00;
            r3.getClass();
            r1.dekTemplate_ = r3;
            r1.bitField0_ |= 1;
            return (C384429hJ) A0C.A01();
        } catch (AnonymousClass9GO e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    public static AnonymousClass98D A02(C39881ADd aDd) {
        if (C39881ADd.A02.equals(aDd)) {
            return AnonymousClass98D.TINK;
        }
        if (C39881ADd.A01.equals(aDd)) {
            return AnonymousClass98D.RAW;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to serialize variant: ");
        sb.append(aDd);
        throw new GeneralSecurityException(sb.toString());
    }
}
