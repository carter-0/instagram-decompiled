package X;

import android.app.Activity;
import com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import java.util.List;

public final class JUI extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public boolean A06;
    public final int A07;
    public final Object A08;

    /* JADX WARNING: type inference failed for: r8v0, types: [X.JUI, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A07) {
            case 0:
                return ((CommonCdlProviderHolder) A00(obj, this)).A00((C15046UKz) null, (C18073Vl1) null, this, false);
            case 1:
                return ((AiAgentThreadLauncher) A00(obj, this)).A03((Activity) null, (AnonymousClass0iw) null, (String) null, (String) null, this);
            case 2:
                return DirectConfigureMediaMessageMutationFactory.A02((AnonymousClass797) null, (DirectConfigureMediaMessageMutationFactory) A00(obj, this), (1Xj) null, (DirectThreadKey) null, this, false);
            case 3:
                return IgLiveCommentsRepository.A04((IgLiveCommentsRepository) A00(obj, this), (List) null, this, false, false);
            default:
                return GLR.A03((C52259GLa) null, (GLR) A00(obj, this), (Long) null, (String) null, (List) null, this, false, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JUI(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A07 = i;
        this.A08 = obj;
    }

    public static Object A00(Object obj, JUI jui) {
        jui.A05 = obj;
        jui.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return jui.A08;
    }

    public static boolean A01(int i, Object obj) {
        if (!(obj instanceof JUI) || ((JUI) obj).A07 != i) {
            return false;
        }
        return true;
    }
}
