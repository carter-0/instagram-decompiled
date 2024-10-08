package X;

import android.content.Context;
import com.facebook.cdl.gltfmemorypointerholder.GltfMemoryPointerWrapper;
import com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder;
import com.instagram.realtimeclient.RealtimeConstants;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class UIE extends C18081VlB {
    public GltfMemoryPointerWrapper A00;
    public LiveEditingRawMemoryPointerHolder A01;
    public String A02;
    public WeakReference A03;
    public boolean A04;
    public final Context A05;
    public final C64301LZb A06;
    public final C262224Cq A07;

    public static final void A00(UIE uie) {
        if (uie.A02 != null && uie.A00 != null) {
            C64301LZb lZb = uie.A0C;
            JSONObject A022 = C18668VwQ.A02(RealtimeConstants.SEND_SUCCESS);
            C64164LRf lRf = lZb.A00;
            if (lRf != null) {
                lRf.A0D.A02.A00(A022);
                C64301LZb lZb2 = uie.A06;
                String str = uie.A02;
                if (str != null) {
                    String str2 = uie.A03;
                    if (str2 != null) {
                        GltfMemoryPointerWrapper gltfMemoryPointerWrapper = uie.A00;
                        if (gltfMemoryPointerWrapper != null) {
                            C64164LRf lRf2 = lZb2.A00;
                            if (lRf2 != null) {
                                lRf2.A0E.A00.loadAvatarFromMemory(str, str2, gltfMemoryPointerWrapper);
                                return;
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            0qQ.A0F("provider");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A01(UIE uie) {
        LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder;
        String str = uie.A02;
        if (str != null && (liveEditingRawMemoryPointerHolder = uie.A01) != null) {
            C64301LZb lZb = uie.A06;
            String str2 = uie.A04;
            if (str2 != null) {
                C64164LRf lRf = lZb.A00;
                if (lRf == null) {
                    0qQ.A0F("provider");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    lRf.A0E.A00.loadColorRampFromMemory(str, str2, liveEditingRawMemoryPointerHolder);
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UIE(Context context, MTM mtm, C64301LZb lZb, C262224Cq r5) {
        super(lZb);
        AnonymousClass7TG.A1P(context, lZb);
        this.A05 = context;
        this.A06 = lZb;
        this.A07 = r5;
        this.A03 = new WeakReference(mtm);
    }
}
