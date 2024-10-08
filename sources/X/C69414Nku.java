package X;

import com.facebook.common.dextricks.DexOptimization;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Nku  reason: case insensitive filesystem */
public enum C69414Nku {
    A0G("SEND_FAILURE_DOMAIN_UNKNOWN", "unknown"),
    A0C("SEND_FAILURE_DOMAIN_CLIENT", DexOptimization.OPT_KEY_CLIENT),
    A0D("SEND_FAILURE_DOMAIN_HTTP", "http"),
    A0B("SEND_FAILURE_DOMAIN_API", "api"),
    A0F("SEND_FAILURE_DOMAIN_SNAPSHOT", "snapshot"),
    A0E("SEND_FAILURE_DOMAIN_MEM", "mem"),
    A0A("INSTAMADILLO_SEND_FAILURE_DOMAIN_SEND", "IGDirectInstamadilloSendErrorDomain"),
    A06("INSTAMADILLO_SEND_FAILURE_DOMAIN_ENCRYPTION", "IGDirectInstamadilloEncryptionErrorDomain"),
    A07("INSTAMADILLO_SEND_FAILURE_DOMAIN_MEDIA_MESSAGE", "IGDirectInstamadilloMediaMessageSendErrorDomain"),
    A09("INSTAMADILLO_SEND_FAILURE_DOMAIN_MISSING_THREAD_ID", "IGDirectInstamadilloMissingThreadIdErrorDomain"),
    A05("INSTAMADILLO_SEND_FAILURE_DOMAIN_DISAPPEARING_MESSAGE", "IGDirectInstamadilloDisappearingMessageErrorDomain"),
    A08("INSTAMADILLO_SEND_FAILURE_DOMAIN_MESSAGE_METADATA_PREFETCH", "IGDirectInstamadilloMessageMetadataPrefetchErrorDomain");
    
    public static final Map A02 = null;
    public final int A00;
    public final String A01;

    /* access modifiers changed from: public */
    static {
        int i;
        C69414Nku[] nkuArr;
        A03 = 0oU.A00(nkuArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C69414Nku nku : values()) {
            A0x.put(nku.A01, nku);
        }
        A02 = A0x;
    }

    public final String toString() {
        return this.A01;
    }

    /* access modifiers changed from: public */
    C69414Nku(String str, String str2) {
        this.A01 = str2;
        this.A00 = r2;
    }
}
