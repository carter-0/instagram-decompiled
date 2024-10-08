package X;

import androidx.datastore.core.SingleProcessDataStore;
import androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;
import com.instagram.wellbeing.respectfulcommentnudge.impl.RespectfulNudgePluginImpl;
import java.util.List;
import java.util.Set;

/* renamed from: X.9Ji  reason: invalid class name and case insensitive filesystem */
public final class C376789Ji extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;
    public final Object A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376789Ji(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A07 = i;
        this.A08 = obj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C376789Ji) || ((C376789Ji) obj).A07 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.4D7, X.9Ji] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A07;
        this.A06 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        switch (i) {
            case 0:
                return ((SingleProcessDataStore$readAndInit$api$1) this.A08).FK3(this, (0sL) null);
            case 1:
                return ((SingleProcessDataStore) this.A08).A07((Object) null, this);
            case 2:
                return SavedMediaMetadataService.A00((C279284yO) null, (SavedMediaMetadataService) this.A08, (List) null, this);
            case 3:
                return MutedWordsFilterManager.A00((MutedWordsFilterManager) this.A08, (Set) null, this);
            default:
                return ((RespectfulNudgePluginImpl) this.A08).A01((0wc) null, (UserSession) null, (1Xj) null, (Integer) null, (String) null, (String) null, (List) null, this, false);
        }
    }
}
