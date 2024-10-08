package X;

import com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl;
import com.instagram.bugreporter.BugReportComposerFragment;
import com.instagram.igtv.draft.model.IGTVDraftsRepository;
import com.instagram.security.attestation.playintegrity.client.PlayIntegrityRequester;

/* renamed from: X.MDi  reason: case insensitive filesystem */
public final class C66130MDi extends C64101El {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66130MDi(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A04 = i;
        this.A05 = obj;
    }

    public static Object A00(Object obj, C66130MDi mDi) {
        mDi.A03 = obj;
        mDi.A01 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return mDi.A05;
    }

    public static boolean A01(int i, Object obj) {
        if (!(obj instanceof C66130MDi) || ((C66130MDi) obj).A04 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MDi, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A04) {
            case 0:
                return ((StickerTypeaheadImpl) A00(obj, this)).A00((String) null, (String) null, this);
            case 1:
                return BugReportComposerFragment.A02((BugReportComposerFragment) A00(obj, this), this, 0);
            case 2:
                return ((IGTVDraftsRepository) A00(obj, this)).AOT(0, this);
            case 3:
                return ((PlayIntegrityRequester) A00(obj, this)).A00((String) null, this);
            default:
                return C71079Oay.A01((String) null, (String) null, this, (C71079Oay) A00(obj, this), 0);
        }
    }
}
