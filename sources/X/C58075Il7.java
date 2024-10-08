package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import com.meta.metaai.promptsheet.service.PromptSheetAINetworkService;
import com.meta.metaai.shared.feedback.data.FeedbackRepository;
import com.meta.metaai.shared.feedback.data.MetaAIFeedbackNetworkService;
import com.meta.metaai.shared.nux.data.MetaAINuxRepository;
import com.meta.metaai.shared.nux.service.MetaAINuxNetworkService;
import com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository;
import com.meta.metaai.writewithai.service.WriteWithAINetworkService;
import java.util.Collection;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Il7  reason: case insensitive filesystem */
public final class C58075Il7 extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58075Il7(int i, AnonymousClass4D7 r2) {
        super(r2);
        this.A03 = i;
    }

    public static void A00(Object obj, C58075Il7 il7) {
        il7.A02 = obj;
        il7.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static void A01(Object obj, C58075Il7 il7) {
        il7.A01 = obj;
        il7.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A02(int i, Object obj) {
        if (!(obj instanceof C58075Il7) || ((C58075Il7) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.Il7, java.lang.Object, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
                A00(obj, this);
                return ((DIK) this.A01).emit((Object) null, this);
            case 1:
                A01(obj, this);
                return ((ImagineNetworkService) this.A02).A09((String) null, this);
            case 2:
                A01(obj, this);
                return ((ImagineNetworkService) this.A02).A06((Bitmap) null, this);
            case 3:
                A01(obj, this);
                return ((PromptSheetAINetworkService) this.A02).A00((C56088Hsb) null, this);
            case 4:
                A01(obj, this);
                return ((FeedbackRepository) this.A02).A00((String) null, (String) null, (String) null, this);
            case 5:
                A01(obj, this);
                return ((MetaAIFeedbackNetworkService) this.A02).A00((String) null, (String) null, (String) null, (String) null, (String) null, this);
            case 6:
                A01(obj, this);
                return ((MetaAINuxRepository) this.A02).A01((C54639HLw) null, this);
            case 7:
                A01(obj, this);
                return ((MetaAINuxNetworkService) this.A02).A00((C54639HLw) null, this);
            case 8:
                A01(obj, this);
                return ((WriteSuggestionsRepository) this.A02).A03((C56568I1x) null, this);
            case 9:
            case 10:
                A00(obj, this);
                return ((DIL) this.A01).emit((Object) null, this);
            case 11:
                A01(obj, this);
                return ((WriteWithAINetworkService) this.A02).A02((C56568I1x) null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A01(obj, this);
                return ((WriteWithAINetworkService) this.A02).A01((C56568I1x) null, (String) null, (String) null, this);
            case 13:
            case 14:
            case 20:
                A00(obj, this);
                return ((C58036IkU) this.A01).emit((Object) null, this);
            case 15:
            case 16:
            case 17:
            case EglBase14Impl.EGLExt_SDK_VERSION:
                A00(obj, this);
                return ((C58038IkW) this.A01).emit((Object) null, this);
            case 19:
                A01(obj, this);
                return I7H.A05((C53452Gok) null, (UserSession) null, (I7H) this.A02, this);
            case 21:
                int i = this.A00;
                if (i == 0) {
                    this.A00 = 1;
                    0eS.A00(obj);
                    0sL r1 = (0sL) this.A02;
                    0qQ.A0C(r1, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                    0u4.A05(r1, 2);
                    return r1.invoke(this.A01, this);
                } else if (i == 1) {
                    this.A00 = 2;
                    0eS.A00(obj);
                    return obj;
                } else {
                    throw AnonymousClass7TE.A0z("This coroutine had already completed");
                }
            case 22:
                A00(obj, this);
                return AnonymousClass42T.A01((Collection) null, this);
            default:
                A00(obj, this);
                return C56378HxX.A00((OYZ) null, (String) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58075Il7(Object obj, AnonymousClass4D7 r3, C262094Cc r4, 0sL r5) {
        super(r3, r4);
        this.A03 = 21;
        this.A02 = r5;
        this.A01 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58075Il7(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A01 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58075Il7(Object obj, AnonymousClass4D7 r2, int i, int i2) {
        super(r2);
        this.A03 = i;
        this.A02 = obj;
    }
}
