package X;

import com.facebook.flipper.plugins.bloksdebugger.BloksRawPayload$Companion;
import com.facebook.flipper.plugins.bloksdebugger.Event;
import com.instagram.common.bloks.flipper.BloksPayloadCacheStatus;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UIj  reason: case insensitive filesystem */
public final class C14984UIj extends Event {
    public static final C255463uA[] A08;
    public static final BloksRawPayload$Companion Companion = new Object();
    public final BloksPayloadCacheStatus A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final Map A07;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.facebook.flipper.plugins.bloksdebugger.BloksRawPayload$Companion] */
    static {
        C258653zQ A002 = C258643zP.A00("com.instagram.common.bloks.flipper.BloksPayloadCacheStatus", BloksPayloadCacheStatus.values());
        C255453u9 r1 = C255453u9.A01;
        A08 = new C255463uA[]{null, A002, null, null, new C258613zM(r1, C258663zR.A00), null, new AnonymousClass409(r1), null};
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C14984UIj(BloksPayloadCacheStatus bloksPayloadCacheStatus, Object obj, String str, String str2, String str3, String str4, @Serializable(with = C20432WrI.class) List list, Map map, int i) {
        if (255 != (i & 255)) {
            VJ6.A00(C20443Wrl.A01, i, 255);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A05 = str;
        this.A00 = bloksPayloadCacheStatus;
        this.A04 = str2;
        this.A03 = str3;
        this.A07 = map;
        this.A01 = obj;
        this.A06 = list;
        this.A02 = str4;
    }
}
