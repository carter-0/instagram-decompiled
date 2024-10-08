package X;

import android.content.Context;
import android.view.View;
import com.instagram.api.schemas.ClipsTemplateBrowserV2Type;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.Map;

/* renamed from: X.IVk  reason: case insensitive filesystem */
public final class C57275IVk implements MVB {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ClipsTemplateBrowserV2Type A01;
    public final /* synthetic */ C267324bN A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ IgSimpleImageView A04;
    public final /* synthetic */ 1Xj A05;
    public final /* synthetic */ AnonymousClass4DU A06;
    public final /* synthetic */ C243373Ym A07;
    public final /* synthetic */ C53013Gh4 A08;
    public final /* synthetic */ C52967GgK A09;
    public final /* synthetic */ C53023GhE A0A;
    public final /* synthetic */ Map A0B;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public C57275IVk(Context context, ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type, C267324bN r3, UserSession userSession, IgSimpleImageView igSimpleImageView, 1Xj r6, AnonymousClass4DU r7, C243373Ym r8, C53013Gh4 gh4, C52967GgK ggK, C53023GhE ghE, Map map) {
        this.A07 = r8;
        this.A01 = clipsTemplateBrowserV2Type;
        this.A08 = gh4;
        this.A02 = r3;
        this.A05 = r6;
        this.A0A = ghE;
        this.A04 = igSimpleImageView;
        this.A00 = context;
        this.A03 = userSession;
        this.A06 = r7;
        this.A0B = map;
        this.A09 = ggK;
    }

    public final void onButtonClick(View view) {
        C53013Gh4 gh4;
        C243373Ym r0 = this.A07;
        C243373Ym r5 = C243373Ym.SAVED;
        if (r0 == r5) {
            r5 = C243373Ym.NOT_SAVED;
        }
        ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type = this.A01;
        if (clipsTemplateBrowserV2Type == ClipsTemplateBrowserV2Type.MAIN) {
            C53013Gh4 gh42 = this.A08;
            if (gh42 != null) {
                gh42.A00(this.A02, r5);
            }
        } else if (clipsTemplateBrowserV2Type == ClipsTemplateBrowserV2Type.SAVED && (gh4 = this.A08) != null) {
            C58105ImR.A01(gh4, this.A05, C318116oQ.A00(gh4), 26);
        }
        C53023GhE ghE = this.A0A;
        C267324bN r1 = this.A02;
        1Xj r3 = this.A05;
        C53023GhE.A00(this.A00, r1, this.A03, r3, this.A06, r5, this.A09, ghE, this.A0B);
    }
}
