package instagram.features.clips.edit;

import X.00k;
import X.0Tu;
import X.0mk;
import X.0nA;
import X.0nc;
import X.0qQ;
import X.0sn;
import X.182;
import X.1ES;
import X.1OC;
import X.1Xj;
import X.1wn;
import X.2PP;
import X.2Yu;
import X.2dZ;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0iw;
import X.AnonymousClass1Nd;
import X.AnonymousClass36R;
import X.AnonymousClass4D6;
import X.AnonymousClass4DH;
import X.AnonymousClass4Ed;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C17990VjS;
import X.C252243on;
import X.C272024jy;
import X.C273654mx;
import X.C290815g0;
import X.C309516Yo;
import X.C331157Pu;
import X.C336207eF;
import X.C357128Wq;
import X.C358248ab;
import X.C47190Dsc;
import X.C50327FYh;
import X.C60128Jg9;
import X.C60296Jiu;
import X.C60409Jl2;
import X.C61000Juw;
import X.C61062Jw0;
import X.C61402K5w;
import X.C61500KAf;
import X.C63009Kpz;
import X.C63801L7h;
import X.C64646LfY;
import X.C64700LgV;
import X.C65685Ly0;
import X.C65687Ly2;
import X.C65688Ly3;
import X.C66069MAc;
import X.C66480MTi;
import X.C66510MUo;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbW;
import X.DbY;
import X.Dba;
import X.F5M;
import X.K1L;
import X.K5H;
import X.KH1;
import X.L7S;
import X.LDQ;
import X.LFB;
import X.LFL;
import X.LM3;
import X.LOe;
import X.LY3;
import X.MUF;
import X.MVG;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.api.schemas.IGCreatorIncentiveProgramFetchEntryPoint;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.incentiveplatform.api.IncentivePlatformApi;
import com.instagram.modal.ModalActivity;
import com.instagram.model.shopping.video.ShoppingCreationConfig;
import com.instagram.model.venue.Venue;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ClipsEditMetadataController implements AnonymousClass0iw, C252243on, C66510MUo, C66480MTi {
    public TextView A00;
    public TextView A01;
    public C61062Jw0 A02;
    public C47190Dsc A03;
    public BrandedContentGatingInfoIntf A04;
    public BrandedContentProjectMetadataIntf A05;
    public MediaGenAIDetectionMethod A06;
    public K1L A07;
    public 0nc A08;
    public C61000Juw A09;
    public LDQ A0A;
    public LFL A0B;
    public LM3 A0C;
    public 1Xj A0D;
    public C336207eF A0E;
    public C331157Pu A0F;
    public Venue A0G;
    public MusicOverlayStickerModel A0H;
    public TaggingFeedMultiSelectState A0I;
    public IgAutoCompleteTextView A0J;
    public C357128Wq A0K;
    public File A0L;
    public Boolean A0M;
    public String A0N;
    public List A0O;
    public List A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public TextView A0h;
    public BrandedContentProjectMetadataIntf A0i;
    public C64700LgV A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public final Context A0n;
    public final Handler A0o;
    public final TextWatcher A0p;
    public final AnonymousClass4DH A0q;
    public final AnonymousClass0iw A0r;
    public final UserSession A0s;
    public final AnonymousClass4D6 A0t = 1ES.A01();
    public final C50327FYh A0u;
    public final MonetizationRepository A0v;
    public final LFB A0w;
    public final C272024jy A0x;
    public final C17990VjS A0y;
    public final MUF A0z;
    public final C61402K5w A10;
    public final C61402K5w A11;
    public final L7S A12;
    public final String A13;
    public final String A14;
    public final List A15;
    public final AnonymousClass0eM A16;
    public final AnonymousClass0eM A17;
    public final AnonymousClass0eM A18;
    public final AnonymousClass0eM A19;
    public final AnonymousClass0eM A1A;
    public final AnonymousClass0eM A1B;
    public final boolean A1C;
    public final 2dZ A1D;
    public final 1wn A1E;
    public final AnonymousClass4D6 A1F = 1ES.A01();
    public final IncentivePlatformApi A1G;
    public Group audienceGroup;
    public TextView audienceTextView;
    public TextView commentPollTextView;
    public ViewGroup coverPhotoContainer;
    public Group genAIGroup;
    public View genAIToggleRow;
    public LOe locationSuggestionsRow;
    public Group locationTaggingGroup;
    public View metaVerifiedAddLinkRow;
    public IgSimpleImageView metaVerifiedAddLinkRowChevronIconView;
    public IgSimpleImageView metaVerifiedAddLinkRowClearButtonView;
    public TextView metaVerifiedAddLinkRowSubtitleTextView;
    public TextView metaVerifiedAddLinkRowTitleTextView;
    public ViewGroup optionsContainer;
    public Group peopleTaggingGroup;
    public View peopleTaggingRow;
    public C65685Ly0 productTagViewHolder;
    public Group productTaggingGroup;
    public TextView taggedPeopleTextView;
    public IgImageView thumbnailImage;
    public View view;

    public final /* synthetic */ void ADC(View view2) {
    }

    public final /* synthetic */ void D6z(View view2) {
    }

    public final void DOi() {
        A05((Venue) null, this);
        A0K();
    }

    public final void DjY(List list, String str) {
        0qQ.A0B(list, 0);
        UserSession userSession = this.A0s;
        if (str != null) {
            this.A0A = new LDQ(this.A0r, userSession, str, list);
        }
        LOe lOe = this.locationSuggestionsRow;
        if (lOe != null) {
            ArrayList A1D2 = AnonymousClass7TE.A1D(list);
            int size = A1D2.size();
            int i = 5;
            if (5 > size) {
                i = size;
            }
            List subList = A1D2.subList(0, i);
            0qQ.A0B(subList, 0);
            C60409Jl2 jl2 = lOe.A04;
            DbW.A0z(jl2, subList, jl2.A00);
            LOe.A00(lOe, lOe.A02);
            return;
        }
        0qQ.A0F("locationSuggestionsRow");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "instagram.features.clips.edit.ClipsEditMetadataController";
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    /* JADX WARNING: type inference failed for: r16v0, types: [X.8Wp, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v29, types: [X.07Z, X.4DH] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x016d, code lost:
        if (r9 == com.instagram.api.schemas.MediaGenAIDetectionMethod.A0B) goto L_0x016f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            r20 = this;
            r1 = 0
            r2 = r21
            X.0qQ.A0B(r2, r1)
            r0 = r20
            r0.view = r2
            r3 = 2131429595(0x7f0b08db, float:1.8480867E38)
            android.view.View r3 = r2.requireViewById(r3)
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r3 = (com.instagram.ui.widget.textview.IgAutoCompleteTextView) r3
            X.0qQ.A0B(r3, r1)
            r0.A0J = r3
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r3 = r0.A0J()
            r7 = 12
            X.LYN.A00(r3, r7, r0)
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r5 = r0.A0J()
            android.content.res.Resources r4 = r2.getResources()
            r3 = 2131973655(0x7f135617, float:1.9584352E38)
            java.lang.String r3 = r4.getString(r3)
            r5.setHint(r3)
            r3 = 2131430891(0x7f0b0deb, float:1.8483496E38)
            android.view.ViewGroup r4 = X.DbU.A0C(r2, r3)
            X.0qQ.A0B(r4, r1)
            r0.coverPhotoContainer = r4
            r3 = 2131429965(0x7f0b0a4d, float:1.8481618E38)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = X.DbT.A0b(r4, r3)
            X.0qQ.A0B(r3, r1)
            r0.thumbnailImage = r3
            android.view.ViewGroup r4 = r0.coverPhotoContainer
            if (r4 == 0) goto L_0x039b
            r3 = 2131429967(0x7f0b0a4f, float:1.8481622E38)
            android.widget.TextView r4 = X.DbU.A0G(r4, r3)
            r3 = 2131961425(0x7f132651, float:1.9559547E38)
            r4.setText(r3)
            r3 = 2131438331(0x7f0b2afb, float:1.8498586E38)
            android.view.View r3 = r2.requireViewById(r3)
            androidx.constraintlayout.widget.Group r3 = (androidx.constraintlayout.widget.Group) r3
            X.0qQ.A0B(r3, r1)
            r0.productTaggingGroup = r3
            r3 = 2131438326(0x7f0b2af6, float:1.8498576E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r2, r3)
            X.Ly0 r4 = new X.Ly0
            r4.<init>(r3)
            r0.productTagViewHolder = r4
            X.MUF r3 = r0.A0z
            X.Ly3 r3 = (X.C65688Ly3) r3
            r3.A00 = r4
            r3 = 2131437580(0x7f0b280c, float:1.8497063E38)
            android.view.View r3 = r2.requireViewById(r3)
            androidx.constraintlayout.widget.Group r3 = (androidx.constraintlayout.widget.Group) r3
            X.0qQ.A0B(r3, r1)
            r0.peopleTaggingGroup = r3
            r3.setVisibility(r1)
            r3 = 2131437578(0x7f0b280a, float:1.8497059E38)
            android.view.View r4 = r2.requireViewById(r3)
            X.0qQ.A0B(r4, r1)
            r0.peopleTaggingRow = r4
            r3 = 2131436327(0x7f0b2327, float:1.8494521E38)
            android.widget.TextView r3 = X.DbU.A0G(r4, r3)
            r0.taggedPeopleTextView = r3
            r3 = 2131435692(0x7f0b20ac, float:1.8493233E38)
            android.view.View r3 = r2.requireViewById(r3)
            androidx.constraintlayout.widget.Group r3 = (androidx.constraintlayout.widget.Group) r3
            X.0qQ.A0B(r3, r1)
            r0.locationTaggingGroup = r3
            r3 = 2131435690(0x7f0b20aa, float:1.849323E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r2, r3)
            X.LOe r3 = new X.LOe
            r3.<init>(r4)
            r0.locationSuggestionsRow = r3
            com.instagram.common.session.UserSession r15 = r0.A0s
            X.1E8 r4 = X.1E7.A00(r15)
            java.lang.String r3 = r0.A13
            X.1Xj r5 = r4.A02(r3)
            if (r5 != 0) goto L_0x02fe
            X.4D6 r8 = r0.A1F
            X.1OC r6 = X.C3724090s.A04(r15, r3)
            X.KAY r4 = new X.KAY
            r4.<init>(r0)
            r6.A00 = r4
            r8.schedule(r6)
        L_0x00de:
            boolean r4 = X.C250563lf.A0q(r15, r5)
            r6 = 0
            if (r4 == 0) goto L_0x0199
            r4 = 2131430106(0x7f0b0ada, float:1.8481904E38)
            android.view.View r4 = r2.requireViewById(r4)
            androidx.constraintlayout.widget.Group r4 = (androidx.constraintlayout.widget.Group) r4
            X.0qQ.A0B(r4, r1)
            r0.genAIGroup = r4
            r4.setVisibility(r1)
            r4 = 2131430108(0x7f0b0adc, float:1.8481908E38)
            android.view.View r4 = r2.requireViewById(r4)
            X.0qQ.A0B(r4, r1)
            r0.genAIToggleRow = r4
            if (r5 == 0) goto L_0x02fb
            com.instagram.api.schemas.MediaGenAIDetectionMethod r4 = r5.A1I()
        L_0x0108:
            r0.A06 = r4
            androidx.constraintlayout.widget.Group r4 = r0.genAIGroup
            if (r4 == 0) goto L_0x0199
            android.view.View r4 = r0.genAIToggleRow
            if (r4 == 0) goto L_0x0199
            android.content.Context r8 = r0.A0n
            r4 = 2131955481(0x7f130f19, float:1.954749E38)
            java.lang.String r10 = X.AnonymousClass7TE.A16(r8, r4)
            r4 = 2131955482(0x7f130f1a, float:1.9547493E38)
            java.lang.String r9 = X.AnonymousClass7TE.A16(r8, r4)
            int r8 = X.DbV.A02(r8)
            X.Kaz r4 = new X.Kaz
            r4.<init>((instagram.features.clips.edit.ClipsEditMetadataController) r0, (int) r8)
            android.text.SpannableStringBuilder r9 = X.DbS.A0C(r9)
            X.AnonymousClass7AV.A05(r9, r4, r10)
            android.view.View r8 = r0.genAIToggleRow
            if (r8 == 0) goto L_0x039e
            r4 = 2131430112(0x7f0b0ae0, float:1.8481916E38)
            android.view.View r8 = r8.requireViewById(r4)
            java.lang.String r4 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r8, r4)
            android.widget.TextView r8 = (android.widget.TextView) r8
            android.widget.TextView$BufferType r4 = android.widget.TextView.BufferType.SPANNABLE
            r8.setText(r9, r4)
            X.DbT.A1H(r8)
            android.view.View r8 = r0.genAIToggleRow
            if (r8 == 0) goto L_0x039e
            r4 = 2131430111(0x7f0b0adf, float:1.8481914E38)
            android.view.View r10 = r8.requireViewById(r4)
            java.lang.String r4 = "null cannot be cast to non-null type com.instagram.igds.components.switchbutton.IgdsSwitch"
            X.0qQ.A0C(r10, r4)
            com.instagram.igds.components.switchbutton.IgdsSwitch r10 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r10
            X.1Xj r4 = r0.A0D
            r19 = 0
            if (r4 == 0) goto L_0x016f
            com.instagram.api.schemas.MediaGenAIDetectionMethod r9 = r4.A1I()
            if (r9 == 0) goto L_0x016f
            com.instagram.api.schemas.MediaGenAIDetectionMethod r8 = com.instagram.api.schemas.MediaGenAIDetectionMethod.A0B
            r4 = 1
            if (r9 != r8) goto L_0x0170
        L_0x016f:
            r4 = 0
        L_0x0170:
            r10.setChecked(r4)
            r8 = 40
            X.LsA r4 = new X.LsA
            r4.<init>(r0, r8)
            r10.A07 = r4
            X.0iw r4 = r0.A0r
            java.lang.String r17 = r4.getModuleName()
            X.1Xj r4 = r0.A0D
            if (r4 == 0) goto L_0x018a
            java.lang.String r19 = r4.A2n()
        L_0x018a:
            X.9OT r13 = X.AnonymousClass9OT.REEL
            com.instagram.api.schemas.MediaGenAIDetectionMethod r14 = r0.A06
            r4 = 739(0x2e3, float:1.036E-42)
            java.lang.String r18 = X.C273654mx.A00(r4)
            r16 = r6
            X.C250563lf.A0e(r13, r14, r15, r16, r17, r18, r19)
        L_0x0199:
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r10 = r0.A0J()
            r8 = 1
            r10.A07 = r8
            X.7eF r4 = r0.A0E
            if (r4 != 0) goto L_0x01c1
            android.content.Context r12 = r0.A0n
            X.4DH r4 = r0.A0q
            X.0gy r4 = X.AnonymousClass07i.A00(r4)
            X.2lw r11 = new X.2lw
            r11.<init>(r12, r4, r6)
            X.0iw r9 = r0.A0r
            X.1Xj r4 = r0.A0D
            java.lang.String r17 = "clips_edit_metadata_page"
            r13 = r9
            r14 = r11
            r16 = r4
            X.7eF r4 = X.C336207eF.A01(r12, r13, r14, r15, r16, r17)
            r0.A0E = r4
        L_0x01c1:
            r10.setAdapter(r4)
            android.text.TextWatcher r4 = r0.A0p
            r10.addTextChangedListener(r4)
            X.K1L r4 = r0.A07
            if (r4 == 0) goto L_0x02d9
            A0B(r0)
            A08(r0)
        L_0x01d3:
            X.0Tu r9 = X.0Tu.A05
            r3 = 36316087381856181(0x81054a00070fb5, double:3.029778121207691E-306)
            boolean r3 = X.182.A06(r9, r15, r3)
            if (r3 == 0) goto L_0x0254
            r3 = 36316087381594035(0x81054a00030fb3, double:3.029778121041909E-306)
            boolean r3 = X.182.A06(r9, r15, r3)
            if (r3 == 0) goto L_0x0254
            r3 = 36316087381397426(0x81054a00000fb2, double:3.0297781209175726E-306)
            boolean r3 = X.182.A06(r9, r15, r3)
            if (r3 == 0) goto L_0x0254
            if (r5 == 0) goto L_0x02d6
            X.3QO r4 = r5.A1t()
        L_0x01fc:
            X.3QO r3 = X.AnonymousClass3QO.OPAL
            if (r4 == r3) goto L_0x0254
            r3 = 2131428213(0x7f0b0375, float:1.8478064E38)
            android.view.View r3 = r2.requireViewById(r3)
            androidx.constraintlayout.widget.Group r3 = (androidx.constraintlayout.widget.Group) r3
            r3.setVisibility(r1)
            r0.audienceGroup = r3
            r3 = 2131428207(0x7f0b036f, float:1.8478052E38)
            android.view.View r9 = X.AnonymousClass7TF.A0G(r2, r3)
            r3 = 2131436326(0x7f0b2326, float:1.849452E38)
            android.widget.TextView r3 = X.DbU.A0G(r9, r3)
            X.0qQ.A0B(r3, r1)
            r0.audienceTextView = r3
            r3.setVisibility(r1)
            X.0eM r10 = r0.A18
            X.JiG r4 = X.JTT.A0P(r10)
            if (r5 == 0) goto L_0x0230
            X.3QO r6 = r5.A1t()
        L_0x0230:
            X.3QO r3 = X.AnonymousClass3QO.CLOSE_FRIENDS
            if (r6 != r3) goto L_0x02ca
            X.Kh9 r3 = X.C62518Kh9.CLOSE_FRIENDS
        L_0x0236:
            r4.A01(r3, r8)
            X.JiG r3 = X.JTT.A0P(r10)
            X.2Fk r8 = r3.A00
            X.4DH r3 = r0.A0q
            X.07Z r6 = r3.getViewLifecycleOwner()
            r4 = 25
            X.J6f r3 = new X.J6f
            r3.<init>(r0, r4)
            X.C64321LZw.A00(r6, r8, r3, r7)
            r3 = 27
            X.LY2.A00(r9, r3, r5, r0)
        L_0x0254:
            boolean r3 = X.AnonymousClass3YY.A04(r15, r5)
            if (r3 == 0) goto L_0x031b
            boolean r3 = X.JUO.A00(r15)
            if (r3 == 0) goto L_0x031b
            X.4jy r3 = r0.A0x
            if (r3 == 0) goto L_0x031b
            java.util.List r13 = r3.A0F
            if (r13 == 0) goto L_0x031b
            int r8 = r13.size()
            r3 = 2131437891(0x7f0b2943, float:1.8497693E38)
            android.view.View r12 = X.DbY.A0F(r2, r3)
            java.lang.String r3 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r12, r3)
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            r0.optionsContainer = r12
            if (r12 == 0) goto L_0x031b
            r3 = 2131437350(0x7f0b2726, float:1.8496596E38)
            android.view.ViewGroup r11 = X.DbX.A0I(r12, r3)
            android.content.Context r10 = r0.A0n
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r10)
            r7 = 0
        L_0x028c:
            if (r7 >= r8) goto L_0x0303
            r3 = 2131624602(0x7f0e029a, float:1.8876388E38)
            android.view.View r6 = X.DbU.A0A(r9, r11, r3, r1)
            android.content.res.Resources r4 = r10.getResources()
            r3 = 2131165207(0x7f070017, float:1.7944625E38)
            int r3 = r4.getDimensionPixelOffset(r3)
            X.0nA.A0e(r6, r3)
            r3 = 2131437344(0x7f0b2720, float:1.8496584E38)
            android.widget.TextView r4 = X.AnonymousClass7TG.A0R(r6, r3)
            android.content.res.Resources r14 = r10.getResources()
            int r3 = X.2Yu.A07(r10)
            int r3 = r14.getColor(r3)
            r4.setTextColor(r3)
            java.lang.Object r3 = r13.get(r7)
            X.4jw r3 = (X.C272004jw) r3
            java.lang.String r3 = r3.A02
            r4.setText(r3)
            r11.addView(r6)
            int r7 = r7 + 1
            goto L_0x028c
        L_0x02ca:
            boolean r3 = r0.A1C
            if (r3 == 0) goto L_0x02d2
            X.Kh9 r3 = X.C62518Kh9.PRIVATE_ACCOUNT_FOLLOWERS
            goto L_0x0236
        L_0x02d2:
            X.Kh9 r3 = X.C62518Kh9.EVERYONE
            goto L_0x0236
        L_0x02d6:
            r4 = r6
            goto L_0x01fc
        L_0x02d9:
            X.4DH r9 = r0.A0q
            X.1NY r10 = X.AnonymousClass7TG.A0b(r15)
            java.lang.String r4 = "clips/clips_info_for_creation/"
            r10.A0A(r4)
            java.lang.String r4 = "m_pk"
            r10.A0G(r4, r3)
            java.lang.Class<X.K1L> r4 = X.K1L.class
            java.lang.Class<X.LHl> r3 = X.C63993LHl.class
            X.1OC r4 = X.DbU.A0S(r10, r4, r3)
            r3 = 47
            X.C61500KAf.A00(r4, r0, r3)
            r9.schedule(r4)
            goto L_0x01d3
        L_0x02fb:
            r4 = r6
            goto L_0x0108
        L_0x02fe:
            A04(r5, r0)
            goto L_0x00de
        L_0x0303:
            r3 = 2131431407(0x7f0b0fef, float:1.8484542E38)
            android.view.View r6 = r12.requireViewById(r3)
            if (r6 == 0) goto L_0x031b
            r3 = 2131957585(0x7f131751, float:1.9551758E38)
            X.DbU.A12(r10, r6, r3)
            r4 = 4
            X.LXI r3 = new X.LXI
            r3.<init>(r8, r4, r0)
            X.AnonymousClass0fU.A00(r3, r6)
        L_0x031b:
            X.4DH r14 = r0.A0q
            androidx.fragment.app.FragmentActivity r7 = r14.getActivity()
            java.lang.String r3 = "Required value was null."
            if (r7 == 0) goto L_0x0396
            X.1Wr r10 = X.1Wr.A00
            if (r10 == 0) goto L_0x0391
            r11 = 0
            java.lang.String r4 = r14.mTag
            if (r4 != 0) goto L_0x0330
            java.lang.String r4 = ""
        L_0x0330:
            X.LgV r3 = new X.LgV
            r6 = r3
            r8 = r15
            r9 = r0
            r12 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.A0j = r3
            r3.A00()
            X.1Yl r12 = X.C357108Wn.A00()
            X.C357108Wn.A00()
            X.M15 r16 = new X.M15
            r16.<init>()
            r3 = 2131443955(0x7f0b40f3, float:1.8509993E38)
            android.view.ViewStub r13 = X.DbU.A0D(r2, r3)
            r3 = 5
            X.M17 r2 = new X.M17
            r2.<init>(r0, r3)
            r17 = r2
            X.8Wq r2 = r12.A00(r13, r14, r15, r16, r17)
            r0.A0K = r2
            com.instagram.api.schemas.CommentPrompt r2 = X.AnonymousClass4LK.A00(r5)
            if (r2 == 0) goto L_0x0390
            android.view.View r3 = r0.A0I()
            r2 = 2131430514(0x7f0b0c72, float:1.8482731E38)
            android.view.View r4 = X.DbY.A0F(r3, r2)
            android.view.View r3 = r0.A0I()
            r2 = 2131429597(0x7f0b08dd, float:1.8480871E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r3, r2)
            r2.setVisibility(r1)
            r1 = 52
            X.LYA r1 = X.LYA.A00(r4, r2, r0, r1)
            X.AnonymousClass0fU.A00(r1, r2)
            r1 = 53
            X.LYA r0 = X.LYA.A00(r4, r2, r0, r1)
            X.AnonymousClass0fU.A00(r0, r4)
        L_0x0390:
            return
        L_0x0391:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x0396:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x039b:
            java.lang.String r0 = "coverPhotoContainer"
            goto L_0x03a0
        L_0x039e:
            java.lang.String r0 = "genAIToggleRow"
        L_0x03a0:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.clips.edit.ClipsEditMetadataController.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final ArrayList A01(1Xj r4) {
        ArrayList arrayList;
        List coauthorProducers = r4.A0C.getCoauthorProducers();
        if (coauthorProducers != null) {
            arrayList = AnonymousClass7TF.A0p(coauthorProducers);
            Iterator it = coauthorProducers.iterator();
            while (it.hasNext()) {
                DbY.A1W(arrayList, it);
            }
        } else {
            arrayList = 0sn.A00;
        }
        List A3a = r4.A3a();
        ArrayList A0p2 = AnonymousClass7TF.A0p(A3a);
        Iterator it2 = A3a.iterator();
        while (it2.hasNext()) {
            DbY.A1W(A0p2, it2);
        }
        return 00k.A0S(A0p2, arrayList);
    }

    private final void A02() {
        C63801L7h l7h;
        if (this.A07 != null) {
            if (182.A06(0Tu.A05, this.A0s, 36311779529196298L)) {
                View requireViewById = A0I().requireViewById(R.id.funded_content_tag);
                0qQ.A07(requireViewById);
                requireViewById.setVisibility(0);
                DbT.A1F(A0I(), R.id.funded_content_tagging_divider, 0);
                this.A0h = DbU.A0G(A0I(), R.id.funded_content_tag_subtitle);
                K1L k1l = this.A07;
                if (k1l == null || (l7h = k1l.A00) == null || l7h.A00 == null) {
                    LY3.A00(requireViewById, 31, this);
                    TextView textView = this.A0h;
                    if (textView != null) {
                        A03(textView);
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
                TextView A0R2 = AnonymousClass7TG.A0R(A0I(), R.id.funded_content_tag_title);
                Context context = this.A0n;
                A0R2.setTextColor(context.getResources().getColor(2Yu.A08(context)));
                requireViewById.setBackground((Drawable) null);
                requireViewById.setFocusable(true);
            }
        }
    }

    private final void A03(TextView textView) {
        Context context = this.A0n;
        Drawable A002 = 0mk.A00(context, R.drawable.instagram_chevron_right_pano_outline_16);
        0qQ.A07(A002);
        AnonymousClass4Ed.A02(context, A002, R.attr.glyphColorTertiary);
        RectF rectF = 0nA.A01;
        0qQ.A0B(textView, 0);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, A002, (Drawable) null);
    }

    /* JADX WARNING: type inference failed for: r4v25, types: [X.07Z, X.4DH] */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02f2, code lost:
        if (r4 != true) goto L_0x02f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0355, code lost:
        if (r4 != false) goto L_0x0357;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0374, code lost:
        if (r4 != true) goto L_0x0376;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.1Xj r20, instagram.features.clips.edit.ClipsEditMetadataController r21) {
        /*
            r5 = r20
            r0 = r21
            r0.A0D = r5
            X.8Wq r2 = r0.A0K
            if (r2 == 0) goto L_0x001d
            X.3gp r1 = r5.A1T()
            if (r1 == 0) goto L_0x0014
            java.lang.String r1 = r1.A0d
            if (r1 != 0) goto L_0x0016
        L_0x0014:
            java.lang.String r1 = ""
        L_0x0016:
            java.util.List r1 = X.AnonymousClass7TE.A1I(r1)
            r2.A07(r1)
        L_0x001d:
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r2 = r0.A0J()
            X.1Xj r1 = r0.A0D
            if (r1 == 0) goto L_0x002f
            X.3gp r1 = r1.A1T()
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = r1.A0d
            if (r1 != 0) goto L_0x0031
        L_0x002f:
            java.lang.String r1 = ""
        L_0x0031:
            r2.setText(r1)
            android.content.Context r14 = r0.A0n
            com.instagram.model.mediasize.ExtendedImageUrl r6 = r5.A1n(r14)
            r2 = 1
            r1 = 0
            if (r6 == 0) goto L_0x0061
            java.lang.String r3 = r6.A0A
            if (r3 == 0) goto L_0x0061
            int r3 = r3.length()
            if (r3 == 0) goto L_0x0061
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r0.thumbnailImage
            if (r4 == 0) goto L_0x064c
            X.0iw r3 = r0.A0r
            r4.setUrl(r6, r3)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r0.thumbnailImage
            if (r3 == 0) goto L_0x064c
            r3.setEnabled(r2)
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r0.thumbnailImage
            if (r4 == 0) goto L_0x064c
            r3 = 27
            X.LY3.A00(r4, r3, r0)
        L_0x0061:
            com.instagram.common.session.UserSession r6 = r0.A0s
            boolean r3 = X.C347037wA.A05(r6)
            if (r3 == 0) goto L_0x017e
            X.1sQ r3 = X.C51966G9m.A0n(r5)
            if (r3 == 0) goto L_0x017e
            X.1sQ r3 = X.C51966G9m.A0n(r5)
            if (r3 == 0) goto L_0x017e
            X.1rx r3 = r3.Ahp()
            if (r3 == 0) goto L_0x017e
            X.1sQ r3 = X.C51966G9m.A0n(r5)
            if (r3 == 0) goto L_0x0136
            X.1rx r3 = r3.Ahp()
            if (r3 == 0) goto L_0x0136
            boolean r3 = r3.getCanAddTag()
            if (r3 == 0) goto L_0x017e
            android.view.View r4 = r0.A0I()
            r3 = 2131429061(0x7f0b06c5, float:1.8479784E38)
            android.view.View r8 = X.AnonymousClass7TF.A0G(r4, r3)
            r8.setVisibility(r1)
            r3 = 28
            X.LY3.A00(r8, r3, r0)
            android.view.View r4 = r0.A0I()
            r3 = 2131429065(0x7f0b06c9, float:1.8479792E38)
            X.DbT.A1F(r4, r3, r1)
            boolean r3 = r0.A0k
            if (r3 != 0) goto L_0x014e
            r0.A0k = r2
            boolean r3 = r5.A5l()
            r0.A0m = r3
            boolean r3 = r5.A5l()
            r0.A0f = r3
            X.1Xy r3 = r5.A0C
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r3 = r3.Aho()
            r0.A0i = r3
            X.1Xy r3 = r5.A0C
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r3 = r3.Aho()
            r0.A05 = r3
            X.1Xy r3 = r5.A0C
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r3 = r3.BQ3()
            r0.A04 = r3
            boolean r3 = r5.A4z()
            if (r3 == 0) goto L_0x0143
            java.util.List r3 = r5.A3j()
            java.util.ArrayList r11 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r10 = r3.iterator()
        L_0x00e6:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x0107
            java.lang.Object r3 = r10.next()
            X.536 r3 = (X.AnonymousClass536) r3
            java.lang.Boolean r9 = r3.CYy()
            java.lang.Boolean r7 = r3.Bbh()
            com.instagram.user.model.User r4 = r3.ByI()
            X.59G r3 = new X.59G
            r3.<init>(r9, r7, r4)
            r11.add(r3)
            goto L_0x00e6
        L_0x0107:
            java.util.Iterator r11 = r11.iterator()
        L_0x010b:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x013b
            java.lang.Object r7 = r11.next()
            X.59G r7 = (X.AnonymousClass59G) r7
            java.lang.Object r4 = r7.A00
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            java.lang.Object r3 = r7.A01
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            java.lang.Object r10 = r7.A02
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
            java.util.List r9 = r0.A15
            boolean r7 = X.AnonymousClass7TG.A1X(r3)
            boolean r4 = X.AnonymousClass7TG.A1X(r4)
            com.instagram.pendingmedia.model.BrandedContentTag r3 = new com.instagram.pendingmedia.model.BrandedContentTag
            r3.<init>(r10, r7, r4)
            r9.add(r3)
            goto L_0x010b
        L_0x0136:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x013b:
            java.util.List r3 = r0.A15
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1D(r3)
            r0.A0P = r3
        L_0x0143:
            java.lang.Integer r7 = X.AnonymousClass05K.A0F
            java.lang.Integer r4 = X.AnonymousClass05K.A1I
            java.lang.Integer r3 = X.LPL.A00(r6)
            X.JVF.A02(r0, r6, r7, r4, r3)
        L_0x014e:
            r3 = 2131429062(0x7f0b06c6, float:1.8479786E38)
            android.widget.TextView r9 = X.DbU.A0G(r8, r3)
            java.util.List r3 = r0.A0P
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0163
            X.0qQ.A0A(r9)
            r0.A03(r9)
        L_0x0163:
            r0.A01 = r9
            boolean r3 = r0.A0f
            if (r3 == 0) goto L_0x017e
            if (r9 == 0) goto L_0x017e
            java.util.List r8 = r0.A0P
            X.4DH r3 = r0.A0q
            android.content.Context r7 = r3.requireContext()
            boolean r4 = r0.A0f
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r3 = r0.A05
            java.lang.String r3 = X.LSV.A00(r7, r3, r8, r4)
            r9.setText(r3)
        L_0x017e:
            r0.A02()
            X.Jw0 r3 = r0.A02
            r9 = 0
            if (r3 != 0) goto L_0x01c8
            boolean r3 = r0.A0l
            if (r3 != 0) goto L_0x01c8
            X.MUF r4 = r0.A0z
            java.util.List r3 = r0.A0P
            java.lang.Object r3 = X.00k.A0J(r3)
            com.instagram.pendingmedia.model.BrandedContentTag r3 = (com.instagram.pendingmedia.model.BrandedContentTag) r3
            r4.Enm(r3)
            X.1sQ r3 = X.C51966G9m.A0n(r5)
            if (r3 == 0) goto L_0x062c
            com.instagram.model.shopping.clips.ClipsShoppingInfoIntf r4 = r3.Btl()
            if (r4 == 0) goto L_0x062c
            X.LSG r3 = X.LSG.A00
            X.Jw0 r3 = r3.A02(r4)
        L_0x01a9:
            r0.A02 = r3
            X.1sQ r3 = X.C51966G9m.A0n(r5)
            if (r3 == 0) goto L_0x01c6
            com.instagram.model.shopping.clips.ClipsShoppingInfoIntf r3 = r3.Btl()
            if (r3 == 0) goto L_0x01c6
            java.util.List r7 = X.C17023VEx.A00(r3)
            com.instagram.user.model.ProductCollection r4 = r3.Aoo()
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r3 = new com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState
            r3.<init>(r9, r4, r7, r9)
            r0.A0I = r3
        L_0x01c6:
            r0.A0l = r2
        L_0x01c8:
            X.MUF r4 = r0.A0z
            X.Jw0 r3 = r0.A02
            X.C63505KyG.A00(r3, r4)
            X.LFB r8 = r0.A0w
            com.instagram.monetization.repository.MonetizationRepository r4 = r8.A02
            com.instagram.api.schemas.UserMonetizationProductType r3 = com.instagram.api.schemas.UserMonetizationProductType.IGTV_REVSHARE
            boolean r3 = r4.A04(r3)
            if (r3 == 0) goto L_0x027d
            com.instagram.common.session.UserSession r10 = r8.A01
            X.0Tu r7 = X.0Tu.A06
            r3 = 36319106743540638(0x81080900021b9e, double:3.0316875776949354E-306)
            boolean r3 = X.182.A06(r7, r10, r3)
            if (r3 == 0) goto L_0x027d
            X.1Xj r3 = r0.A0D
            if (r3 == 0) goto L_0x027d
            X.1Xy r3 = r3.A0C
            X.DTm r3 = r3.BoM()
            if (r3 == 0) goto L_0x027d
            android.view.View r4 = r0.A0I()
            r3 = 2131439744(0x7f0b3080, float:1.8501452E38)
            android.view.View r11 = X.AnonymousClass7TF.A0F(r4, r3)
            android.view.View r4 = r0.A0I()
            r3 = 2131439745(0x7f0b3081, float:1.8501454E38)
            android.view.View r10 = X.AnonymousClass7TF.A0F(r4, r3)
            r3 = 2131436520(0x7f0b23e8, float:1.8494913E38)
            android.view.View r7 = X.AnonymousClass7TF.A0F(r11, r3)
            com.instagram.igds.components.textcell.IgdsListCell r7 = (com.instagram.igds.components.textcell.IgdsListCell) r7
            X.1Xj r3 = r0.A0D
            if (r3 == 0) goto L_0x0610
            X.1Xy r3 = r3.A0C
            X.DTm r3 = r3.BoM()
            java.lang.String r12 = "Required value was null."
            if (r3 == 0) goto L_0x0647
            java.lang.Integer r3 = r3.Ahk()
            if (r3 == 0) goto L_0x0642
            int r4 = r3.intValue()
            X.Khm r3 = X.C62556Khm.MONETIZED
            int r3 = r3.A00
            if (r4 != r3) goto L_0x0610
            X.1Xj r3 = r0.A0D
            if (r3 == 0) goto L_0x063d
            java.lang.Boolean r3 = r3.A2E()
            r0.A0M = r3
            X.Njo r3 = X.C69349Njo.TYPE_SWITCH
            r7.setTextCellType(r3)
            android.content.Context r4 = r7.getContext()
            r3 = 2131963600(0x7f132ed0, float:1.9563958E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r4, r3)
            r7.A0I(r3)
            java.lang.Boolean r3 = r0.A0M
            if (r3 == 0) goto L_0x0638
            boolean r3 = r3.booleanValue()
            r7.setChecked(r3)
            r3 = 23
            X.LZJ.A00(r7, r0, r3)
            r4 = 5
            X.LuD r3 = new X.LuD
            r3.<init>(r0, r4)
            android.text.SpannableStringBuilder r3 = r8.A00(r3)
        L_0x026a:
            r7.A0H(r3)
            android.text.method.MovementMethod r3 = android.text.method.LinkMovementMethod.getInstance()
            X.0qQ.A07(r3)
            r7.A0B(r3)
            r11.setVisibility(r1)
            r10.setVisibility(r1)
        L_0x027d:
            android.view.View r4 = r0.A0I()
            r3 = 2131427820(0x7f0b01ec, float:1.8477267E38)
            android.view.View r7 = X.AnonymousClass7TF.A0G(r4, r3)
            r7.setVisibility(r1)
            android.view.View r4 = r0.A0I()
            r3 = 2131427821(0x7f0b01ed, float:1.847727E38)
            android.widget.TextView r3 = X.AnonymousClass7TG.A0R(r4, r3)
            r0.A03(r3)
            r3 = 29
            X.LY3.A00(r7, r3, r0)
            X.1Xj r3 = r0.A0D
            r8 = 0
            if (r3 == 0) goto L_0x060d
            X.1sQ r13 = X.C51966G9m.A0n(r3)
        L_0x02a7:
            X.0eM r10 = r0.A16
            java.lang.Object r12 = r10.getValue()
            X.Jiu r12 = (X.C60296Jiu) r12
            r11 = 0
            if (r13 == 0) goto L_0x060a
            java.lang.Boolean r3 = r13.CT8()
            boolean r3 = X.AnonymousClass7TF.A1Y(r3, r2)
        L_0x02ba:
            X.6rJ r7 = r12.A00
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            java.lang.String r3 = "IS_ORIGINAL_MEDIA_PROMO_VIDEO"
            r7.A01(r3, r4)
            X.C60296Jiu.A01(r12)
            java.lang.Object r4 = r10.getValue()
            X.Jiu r4 = (X.C60296Jiu) r4
            if (r13 == 0) goto L_0x0607
            java.lang.Boolean r3 = r13.CTA()
            boolean r3 = X.AnonymousClass7TF.A1Y(r3, r2)
        L_0x02d8:
            X.6rJ r7 = r4.A00
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            java.lang.String r3 = "IS_ORIGINAL_MEDIA_WELCOME_VIDEO"
            r7.A01(r3, r4)
            java.lang.Object r7 = r10.getValue()
            X.Jiu r7 = (X.C60296Jiu) r7
            X.1Xj r3 = r0.A0D
            if (r3 == 0) goto L_0x02f4
            boolean r4 = r3.A51()
            r3 = 1
            if (r4 == r2) goto L_0x02f5
        L_0x02f4:
            r3 = 0
        L_0x02f5:
            X.6rJ r7 = r7.A00
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            java.lang.String r3 = "IS_ORIGINAL_MEDIA_CAPTIONS_ENABLED"
            r7.A01(r3, r4)
            java.lang.Object r4 = r10.getValue()
            X.Jiu r4 = (X.C60296Jiu) r4
            X.1Xj r3 = r0.A0D
            if (r3 == 0) goto L_0x0604
            X.1Xy r3 = r3.A0C
            java.lang.Boolean r3 = r3.CES()
            boolean r3 = X.AnonymousClass7TF.A1Y(r3, r2)
        L_0x0314:
            X.6rJ r7 = r4.A00
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            java.lang.String r3 = "IS_CAPTIONS_TRANSLATIONS_ENABLED"
            r7.A01(r3, r4)
            java.lang.Object r4 = r10.getValue()
            X.Jiu r4 = (X.C60296Jiu) r4
            X.1Xj r3 = r0.A0D
            if (r3 == 0) goto L_0x0601
            X.1Xy r3 = r3.A0C
            java.lang.Boolean r3 = r3.Bzl()
            boolean r3 = X.AnonymousClass7TF.A1Y(r3, r2)
        L_0x0333:
            X.6rJ r7 = r4.A00
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            java.lang.String r3 = "IS_STICKER_TRANSLATIONS_ENABLED"
            r7.A01(r3, r4)
            java.lang.Object r7 = r10.getValue()
            X.Jiu r7 = (X.C60296Jiu) r7
            X.1Xj r3 = r0.A0D
            if (r3 == 0) goto L_0x0357
            X.1Xy r3 = r3.A0C
            java.util.List r3 = r3.CEN()
            if (r3 == 0) goto L_0x0357
            boolean r4 = r3.isEmpty()
            r3 = 0
            if (r4 == 0) goto L_0x0358
        L_0x0357:
            r3 = 1
        L_0x0358:
            r3 = r3 ^ 1
            X.6rJ r7 = r7.A00
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            java.lang.String r3 = "REEL_CONTAINS_STICKER_TRANSLATIONS"
            r7.A01(r3, r4)
            java.lang.Object r7 = r10.getValue()
            X.Jiu r7 = (X.C60296Jiu) r7
            X.1Xj r3 = r0.A0D
            if (r3 == 0) goto L_0x0376
            boolean r4 = r3.A5P()
            r3 = 1
            if (r4 == r2) goto L_0x0377
        L_0x0376:
            r3 = 0
        L_0x0377:
            X.6rJ r7 = r7.A00
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            java.lang.String r3 = "IS_EXCLUSIVE_CONTENT"
            r7.A01(r3, r4)
            java.lang.Object r4 = r10.getValue()
            X.Jiu r4 = (X.C60296Jiu) r4
            X.1Xj r3 = r0.A0D
            if (r3 == 0) goto L_0x0398
            X.1Xy r3 = r3.A0C
            com.instagram.api.schemas.ClipsTrialDict r3 = r3.AoL()
            if (r3 == 0) goto L_0x0398
            com.instagram.api.schemas.MediaTrialStatus r8 = r3.BzK()
        L_0x0398:
            com.instagram.api.schemas.MediaTrialStatus r3 = com.instagram.api.schemas.MediaTrialStatus.ACTIVE
            if (r8 != r3) goto L_0x039d
            r11 = 1
        L_0x039d:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r11)
            X.6rJ r4 = r4.A00
            java.lang.String r3 = "IS_TRIAL_REEL"
            r4.A01(r3, r7)
            boolean r3 = r5.A5P()
            if (r3 == 0) goto L_0x03b3
            X.LM3 r9 = new X.LM3
            r9.<init>(r14)
        L_0x03b3:
            r0.A0C = r9
            com.instagram.model.venue.Venue r4 = r5.A23()
            r0.A0G = r4
            X.LOe r3 = r0.locationSuggestionsRow
            if (r3 == 0) goto L_0x0635
            r3.A01(r0, r4)
            X.3QO r4 = r5.A1t()
            X.3QO r3 = X.AnonymousClass3QO.OPAL
            if (r4 != r3) goto L_0x05e2
            androidx.constraintlayout.widget.Group r3 = r0.peopleTaggingGroup
            if (r3 == 0) goto L_0x064f
            r4 = 8
            r3.setVisibility(r4)
            androidx.constraintlayout.widget.Group r3 = r0.audienceGroup
            if (r3 == 0) goto L_0x03da
            r3.setVisibility(r4)
        L_0x03da:
            X.1Xj r3 = r0.A0D
            boolean r3 = X.GPm.A00(r6, r3)
            if (r3 == 0) goto L_0x048b
            android.view.View r4 = r0.A0I()
            r3 = 2131439841(0x7f0b30e1, float:1.8501649E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r4, r3)
            r3.setVisibility(r1)
            android.view.View r4 = r0.A0I()
            r3 = 2131439839(0x7f0b30df, float:1.8501644E38)
            android.view.View r7 = X.AnonymousClass7TF.A0G(r4, r3)
            X.4DH r9 = r0.A0q
            androidx.fragment.app.FragmentActivity r13 = r9.requireActivity()
            java.lang.String r4 = r0.A13
            X.L7S r8 = r0.A12
            X.LnS r3 = new X.LnS
            r3.<init>(r0, r2)
            X.Lo8 r12 = new X.Lo8
            r15 = r6
            r16 = r3
            r17 = r8
            r18 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18)
            X.Lo3 r3 = new X.Lo3
            r3.<init>(r7, r0)
            X.LFL r10 = new X.LFL
            r10.<init>(r9, r6, r3, r12)
            boolean r3 = X.AnonymousClass1GD.A03()
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x0438
            X.4DH r3 = r10.A01
            androidx.fragment.app.FragmentActivity r3 = r3.requireActivity()
            android.content.res.Resources$Theme r4 = r3.getTheme()
            r3 = 2132017951(0x7f14031f, float:1.9674195E38)
            r4.applyStyle(r3, r2)
        L_0x0438:
            r10.A01(r7, r1)
            com.instagram.music.common.model.MusicOverlayStickerModel r4 = r0.A0H
            if (r4 == 0) goto L_0x045b
            com.instagram.music.common.model.MusicAssetModel r9 = com.instagram.music.common.model.MusicAssetModel.A03(r4)
            java.lang.Integer r3 = r4.A0K
            int r7 = X.AnonymousClass7TG.A0A(r3)
            java.lang.Integer r3 = r4.A0O
            int r3 = X.C51967G9n.A04(r3, r1)
            com.instagram.music.common.model.AudioOverlayTrack r4 = new com.instagram.music.common.model.AudioOverlayTrack
            r4.<init>(r9, r7, r3)
            r10.A00 = r4
            X.MSA r3 = r10.A03
            r3.DtB(r4)
        L_0x045b:
            r0.A0B = r10
            boolean r3 = r0.A0e
            if (r3 != 0) goto L_0x048b
            r0.A0e = r2
            X.0wc r4 = r8.A01
            java.lang.String r3 = "ig_camera_share_sheet_entity_impression"
            X.0Aj r7 = X.AnonymousClass7TE.A0e(r4, r3)
            boolean r3 = r7.isSampled()
            if (r3 == 0) goto L_0x048b
            X.JTP.A1E(r7)
            java.lang.String r3 = r8.A02
            X.JTO.A1S(r7, r3)
            r4 = 18
            java.lang.String r3 = "entity_type"
            X.AnonymousClass7TE.A1W(r7, r3, r4)
            X.0iw r3 = r8.A00
            X.DbW.A15(r7, r3)
            X.JTP.A1F(r7)
            X.AnonymousClass7TH.A0V(r7)
        L_0x048b:
            X.0eE r8 = X.AnonymousClass0t1.A01
            X.4Cl r3 = X.DbS.A0h(r6, r8)
            java.lang.Boolean r3 = r3.CS9()
            if (r3 == 0) goto L_0x052f
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x052f
            X.0Tu r7 = X.0Tu.A05
            r3 = 36322821890648531(0x810b6a000829d3, double:3.0340370516856635E-306)
            boolean r3 = X.182.A06(r7, r6, r3)
            if (r3 == 0) goto L_0x052f
            X.1Xy r3 = r5.A0C
            java.lang.String r7 = r3.BVF()
            if (r7 != 0) goto L_0x04b4
            java.lang.String r7 = ""
        L_0x04b4:
            android.view.View r4 = r0.A0I()
            r3 = 2131436301(0x7f0b230d, float:1.8494469E38)
            X.DbT.A1F(r4, r3, r1)
            X.27r r15 = X.27p.A01(r6)
            java.lang.String r17 = r5.getId()
            X.JVj r16 = X.C59725JVj.POST_CAPTURE
            com.instagram.user.model.User r3 = r8.A01(r6)
            java.lang.String r18 = r3.getId()
            int r3 = r7.length()
            if (r3 != 0) goto L_0x05de
            java.lang.String r19 = "add_button"
        L_0x04d8:
            X.0iw r3 = r0.A0r
            java.lang.String r20 = r3.getModuleName()
            r15.A1T(r16, r17, r18, r19, r20)
            android.view.View r4 = r0.A0I()
            r3 = 2131436299(0x7f0b230b, float:1.8494464E38)
            android.view.View r3 = r4.requireViewById(r3)
            X.0qQ.A0B(r3, r1)
            r0.metaVerifiedAddLinkRow = r3
            android.widget.TextView r3 = X.Dba.A06(r3)
            X.0qQ.A0B(r3, r1)
            r0.metaVerifiedAddLinkRowTitleTextView = r3
            android.view.View r3 = r0.metaVerifiedAddLinkRow
            if (r3 == 0) goto L_0x062f
            android.widget.TextView r3 = X.Dba.A05(r3)
            X.0qQ.A0B(r3, r1)
            r0.metaVerifiedAddLinkRowSubtitleTextView = r3
            android.view.View r4 = r0.metaVerifiedAddLinkRow
            if (r4 == 0) goto L_0x062f
            r3 = 2131429896(0x7f0b0a08, float:1.8481478E38)
            com.instagram.common.ui.base.IgSimpleImageView r3 = X.JTP.A0T(r4, r3)
            X.0qQ.A0B(r3, r1)
            r0.metaVerifiedAddLinkRowChevronIconView = r3
            android.view.View r4 = r0.metaVerifiedAddLinkRow
            if (r4 == 0) goto L_0x062f
            r3 = 2131429945(0x7f0b0a39, float:1.8481577E38)
            com.instagram.common.ui.base.IgSimpleImageView r4 = X.JTP.A0T(r4, r3)
            X.0qQ.A0B(r4, r1)
            r0.metaVerifiedAddLinkRowClearButtonView = r4
            r3 = 26
            X.LY2.A00(r4, r3, r5, r0)
            A0D(r0, r7)
        L_0x052f:
            X.1Xy r3 = r5.A0C
            X.1eb r7 = r3.BFi()
            X.0Tu r5 = X.0Tu.A05
            r3 = 36317358692570195(0x810672000d1453, double:3.030582103222391E-306)
            boolean r3 = X.182.A06(r5, r6, r3)
            if (r3 == 0) goto L_0x05d1
            if (r7 == 0) goto L_0x05db
            boolean r3 = r0.A0U
            if (r3 != 0) goto L_0x056c
            X.0eM r3 = r0.A17
            java.lang.Object r8 = r3.getValue()
            X.Jil r8 = (X.C60289Jil) r8
            long r3 = r7.BfK()
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = r7.getTitle()
            java.lang.String r11 = r7.BgZ()
            java.lang.String r12 = r7.BfL()
            r13 = r1
            r8.A01(r9, r10, r11, r12, r13)
            X.Juw r3 = X.C60289Jil.A0D
            r0.A09 = r3
        L_0x056c:
            r20 = 1
        L_0x056e:
            android.view.View r4 = r0.A0I()
            r3 = 2131428678(0x7f0b0546, float:1.8479007E38)
            X.DbT.A1F(r4, r3, r1)
            android.view.View r3 = r0.A0I()
            r1 = 2131428676(0x7f0b0544, float:1.8479003E38)
            android.view.View r15 = X.AnonymousClass7TF.A0G(r3, r1)
            X.Juw r1 = r0.A09
            boolean r19 = X.AnonymousClass7TF.A1V(r1)
            java.lang.String r3 = r0.A13
            X.KkS r7 = X.C62666KkS.BIO_IG_REELS_EDIT
            boolean r1 = r0.A0d
            X.LBJ r13 = new X.LBJ
            r21 = r1
            r17 = r6
            r18 = r3
            r16 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            X.Hvd r8 = new X.Hvd
            r8.<init>()
            X.0eM r1 = r0.A17
            java.lang.Object r1 = r1.getValue()
            X.Jil r1 = (X.C60289Jil) r1
            X.2Fk r5 = r1.A01
            X.4DH r4 = r0.A0q
            r1 = 13
            X.J6R r3 = new X.J6R
            r3.<init>(r1, r13, r8)
            r1 = 12
            X.C64321LZw.A00(r4, r5, r3, r1)
            boolean r1 = r0.A0Q
            if (r1 != 0) goto L_0x05d1
            X.JbO r1 = X.JZM.A00(r6)
            X.0Aj r3 = X.C59899JbO.A01(r7, r1)
            if (r20 == 0) goto L_0x05d2
            java.lang.String r1 = "seller_view_edit_product_button"
            X.DbS.A1I(r3, r1)
            r3.Cgf()
        L_0x05cf:
            r0.A0Q = r2
        L_0x05d1:
            return
        L_0x05d2:
            java.lang.String r1 = "seller_view_add_purchase_button"
            X.DbS.A1I(r3, r1)
            r3.Cgf()
            goto L_0x05cf
        L_0x05db:
            r20 = 0
            goto L_0x056e
        L_0x05de:
            java.lang.String r19 = "edit_button"
            goto L_0x04d8
        L_0x05e2:
            boolean r3 = r5.A4s()
            if (r3 == 0) goto L_0x05fe
            java.util.ArrayList r3 = r5.A3E()
        L_0x05ec:
            java.util.ArrayList r4 = r5.A39()
            A0E(r0, r3, r4)
            android.view.View r4 = r0.peopleTaggingRow
            if (r4 == 0) goto L_0x0632
            r3 = 25
            X.LY2.A00(r4, r3, r5, r0)
            goto L_0x03da
        L_0x05fe:
            X.0sn r3 = X.0sn.A00
            goto L_0x05ec
        L_0x0601:
            r3 = 0
            goto L_0x0333
        L_0x0604:
            r3 = 0
            goto L_0x0314
        L_0x0607:
            r3 = 0
            goto L_0x02d8
        L_0x060a:
            r3 = 0
            goto L_0x02ba
        L_0x060d:
            r13 = r9
            goto L_0x02a7
        L_0x0610:
            android.content.Context r4 = r7.getContext()
            r3 = 2131963606(0x7f132ed6, float:1.956397E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r4, r3)
            r7.A0I(r3)
            r3 = 6
            X.LuD r4 = new X.LuD
            r4.<init>(r0, r3)
            java.lang.String r3 = "https://help.instagram.com/2635536099905516"
            android.text.SpannableStringBuilder r3 = r8.A01(r4, r3, r1)
            goto L_0x026a
        L_0x062c:
            r3 = 0
            goto L_0x01a9
        L_0x062f:
            java.lang.String r0 = "metaVerifiedAddLinkRow"
            goto L_0x0651
        L_0x0632:
            java.lang.String r0 = "peopleTaggingRow"
            goto L_0x0651
        L_0x0635:
            java.lang.String r0 = "locationSuggestionsRow"
            goto L_0x0651
        L_0x0638:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x063d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x0642:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x0647:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x064c:
            java.lang.String r0 = "thumbnailImage"
            goto L_0x0651
        L_0x064f:
            java.lang.String r0 = "peopleTaggingGroup"
        L_0x0651:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.clips.edit.ClipsEditMetadataController.A04(X.1Xj, instagram.features.clips.edit.ClipsEditMetadataController):void");
    }

    public static final void A05(Venue venue, ClipsEditMetadataController clipsEditMetadataController) {
        clipsEditMetadataController.A0G = venue;
        LOe lOe = clipsEditMetadataController.locationSuggestionsRow;
        if (lOe != null) {
            lOe.A02(venue);
            1Xj r0 = clipsEditMetadataController.A0D;
            if (r0 != null) {
                clipsEditMetadataController.A0X = !2PP.A00(r0.A23(), venue);
                A0C(clipsEditMetadataController);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        0qQ.A0F("locationSuggestionsRow");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A06(ClipsEditMetadataController clipsEditMetadataController) {
        String A002;
        String str;
        if (clipsEditMetadataController.A0v.A05(UserMonetizationProductType.INCENTIVE_PLATFORM)) {
            if (!clipsEditMetadataController.A0a) {
                clipsEditMetadataController.A0a = true;
                C50327FYh fYh = clipsEditMetadataController.A0u;
                Integer num = AnonymousClass05K.A00;
                K1L k1l = clipsEditMetadataController.A07;
                if (k1l != null) {
                    C63801L7h l7h = k1l.A00;
                    if (l7h != null) {
                        str = l7h.A01;
                    } else {
                        str = null;
                    }
                    fYh.A00(num, str, clipsEditMetadataController.A13, (String) null);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            View requireViewById = clipsEditMetadataController.A0I().requireViewById(R.id.bonuses_tag);
            0qQ.A07(requireViewById);
            requireViewById.setVisibility(0);
            DbT.A1F(clipsEditMetadataController.A0I(), R.id.bonuses_tagging_divider, 0);
            clipsEditMetadataController.A00 = DbU.A0G(clipsEditMetadataController.A0I(), R.id.bonuses_tag_subtitle);
            K1L k1l2 = clipsEditMetadataController.A07;
            if (k1l2 != null) {
                C63801L7h l7h2 = k1l2.A00;
                if (l7h2 == null || l7h2.A00 == null) {
                    LY3.A00(requireViewById, 30, clipsEditMetadataController);
                    TextView textView = clipsEditMetadataController.A00;
                    if (textView != null) {
                        clipsEditMetadataController.A03(textView);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    TextView A0R2 = AnonymousClass7TG.A0R(clipsEditMetadataController.A0I(), R.id.bonuses_tag_title);
                    Context context = clipsEditMetadataController.A0n;
                    A0R2.setTextColor(context.getResources().getColor(2Yu.A08(context)));
                    requireViewById.setBackground((Drawable) null);
                    requireViewById.setFocusable(true);
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        TextView textView2 = clipsEditMetadataController.A00;
        if (textView2 != null) {
            C47190Dsc dsc = clipsEditMetadataController.A03;
            if (dsc != null) {
                List list = dsc.A01;
                K1L k1l3 = clipsEditMetadataController.A07;
                if (k1l3 != null) {
                    C63801L7h l7h3 = k1l3.A00;
                    if (l7h3 == null || (A002 = l7h3.A01) == null) {
                        String str2 = clipsEditMetadataController.A0N;
                        if (str2 == null || (A002 = F5M.A00(str2, list)) == null) {
                            textView2.setText(2131968496);
                            A0C(clipsEditMetadataController);
                            return;
                        }
                    } else if (!l7h3.A03) {
                        A002 = AnonymousClass7TE.A16(clipsEditMetadataController.A0n, 2131968496);
                    }
                    textView2.setText(A002);
                    A0C(clipsEditMetadataController);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public static final void A08(ClipsEditMetadataController clipsEditMetadataController) {
        if (!clipsEditMetadataController.A0v.A05(UserMonetizationProductType.INCENTIVE_PLATFORM)) {
            return;
        }
        if (clipsEditMetadataController.A03 != null) {
            A06(clipsEditMetadataController);
            return;
        }
        AnonymousClass4DH r4 = clipsEditMetadataController.A0q;
        IncentivePlatformApi incentivePlatformApi = clipsEditMetadataController.A1G;
        String str = clipsEditMetadataController.A13;
        1OC A002 = C63009Kpz.A00(DbU.A0M(incentivePlatformApi.A00), IGCreatorIncentiveProgramFetchEntryPoint.A0n, (Integer) null, str);
        C61500KAf.A00(A002, clipsEditMetadataController, 46);
        r4.schedule(A002);
    }

    public static final void A09(ClipsEditMetadataController clipsEditMetadataController) {
        CharSequence charSequence = (CharSequence) ((C60128Jg9) clipsEditMetadataController.A1B.getValue()).A00.A02();
        if (charSequence == null || charSequence.length() == 0) {
            A0A(clipsEditMetadataController);
            return;
        }
        AnonymousClass4D6 r3 = clipsEditMetadataController.A0t;
        C290815g0 r1 = new C290815g0(new C66069MAc(clipsEditMetadataController, 7), 457);
        KH1.A01(r1, clipsEditMetadataController, 21);
        r3.schedule(r1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0108 A[Catch:{ IOException -> 0x0294 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0111 A[Catch:{ IOException -> 0x0294 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0112 A[Catch:{ IOException -> 0x0294 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011b A[Catch:{ IOException -> 0x0294 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x011e A[Catch:{ IOException -> 0x0294 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0A(instagram.features.clips.edit.ClipsEditMetadataController r41) {
        /*
            r7 = r41
            X.Jw0 r0 = r7.A02
            r4 = 0
            if (r0 == 0) goto L_0x000e
            X.VjS r1 = r7.A0y
            X.1Xj r0 = r7.A0D
            r1.A00(r4, r0)
        L_0x000e:
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r7.A0H
            if (r0 == 0) goto L_0x0046
            X.L7S r2 = r7.A12
            X.0wc r0 = r2.A01
            X.1Ln r1 = X.1Ln.A08(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0046
            X.4yP r0 = X.C279294yP.CLIPS
            r1.A0a(r0)
            java.lang.String r0 = "SHARE_SHEET_REPLACE_AUDIO_DONE"
            r1.A0r(r0)
            X.28D r0 = X.28D.A5J
            r1.A0b(r0)
            r1.A0T()
            r1.A0U()
            java.lang.String r0 = r2.A02
            X.JTO.A1U(r1, r0)
            X.0iw r0 = r2.A00
            java.lang.String r0 = r0.getModuleName()
            r1.A0n(r0)
            X.JTS.A1E(r1)
        L_0x0046:
            com.instagram.monetization.repository.MonetizationRepository r1 = r7.A0v
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.INCENTIVE_PLATFORM
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0075
            com.instagram.common.session.UserSession r0 = r7.A0s
            X.FYh r3 = X.C63304Kun.A00(r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            X.Dsc r0 = r7.A03
            if (r0 == 0) goto L_0x0060
            java.util.List r1 = r0.A01
            if (r1 != 0) goto L_0x0062
        L_0x0060:
            X.0sn r1 = X.0sn.A00
        L_0x0062:
            java.lang.String r0 = r7.A0N
            java.lang.String r1 = X.F5M.A00(r0, r1)
            X.1Xj r0 = r7.A0D
            if (r0 == 0) goto L_0x0070
            java.lang.String r4 = r0.getId()
        L_0x0070:
            java.lang.String r0 = r7.A0N
            r3.A00(r2, r1, r4, r0)
        L_0x0075:
            X.1Xj r5 = r7.A0D
            com.instagram.common.session.UserSession r6 = r7.A0s
            X.8Oa r4 = X.AnonymousClass8OY.A00(r6)
            X.0eM r1 = r7.A19
            java.lang.Object r0 = r1.getValue()
            X.JiL r0 = (X.C60264JiL) r0
            X.2Fj r0 = r0.A0A
            java.lang.Object r0 = r0.A02()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00ac
            if (r5 == 0) goto L_0x00ac
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x0099:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a3
            X.JTU.A1M(r3, r2)
            goto L_0x0099
        L_0x00a3:
            java.lang.String r0 = r5.getId()
            if (r0 == 0) goto L_0x02b8
            r4.A01(r0, r3)
        L_0x00ac:
            X.1Xj r0 = r7.A0D
            if (r0 == 0) goto L_0x00e1
            X.1Xy r0 = r0.A0C
            X.1eb r0 = r0.BFi()
            if (r0 == 0) goto L_0x00e1
            X.Juw r0 = r7.A09
            if (r0 != 0) goto L_0x00de
            X.Juw r0 = X.C60289Jil.A0D
            r7.A09 = r0
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
        L_0x00c2:
            java.lang.String r11 = r0.A05
            java.lang.Integer r9 = r0.A02
            java.lang.String r5 = r0.A03
            java.lang.String r4 = r0.A06
            java.lang.String r3 = r0.A04
            int r2 = r0.A00
            boolean r0 = r0.A07
            X.Juw r8 = new X.Juw
            r14 = r3
            r15 = r2
            r16 = r0
            r12 = r5
            r13 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r7.A09 = r8
            goto L_0x00e8
        L_0x00de:
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            goto L_0x00c2
        L_0x00e1:
            X.Juw r0 = r7.A09
            if (r0 == 0) goto L_0x00e8
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            goto L_0x00c2
        L_0x00e8:
            X.4D6 r11 = r7.A0t     // Catch:{ IOException -> 0x0294 }
            boolean r0 = r7.A0H()     // Catch:{ IOException -> 0x0294 }
            if (r0 != 0) goto L_0x0114
            boolean r0 = r7.A0Z     // Catch:{ IOException -> 0x0294 }
            if (r0 != 0) goto L_0x0114
            boolean r0 = r7.A0V     // Catch:{ IOException -> 0x0294 }
            if (r0 != 0) goto L_0x0114
            boolean r0 = r7.A0X     // Catch:{ IOException -> 0x0294 }
            if (r0 != 0) goto L_0x0114
            boolean r0 = r7.A0T     // Catch:{ IOException -> 0x0294 }
            if (r0 != 0) goto L_0x0114
            boolean r0 = r7.A0Y     // Catch:{ IOException -> 0x0294 }
            if (r0 != 0) goto L_0x0114
            X.1Xj r0 = r7.A0D     // Catch:{ IOException -> 0x0294 }
            if (r0 == 0) goto L_0x0112
            com.instagram.api.schemas.MediaGenAIDetectionMethod r3 = r0.A1I()     // Catch:{ IOException -> 0x0294 }
        L_0x010c:
            com.instagram.api.schemas.MediaGenAIDetectionMethod r0 = r7.A06     // Catch:{ IOException -> 0x0294 }
            r2 = 0
            if (r3 == r0) goto L_0x0115
            goto L_0x0114
        L_0x0112:
            r3 = 0
            goto L_0x010c
        L_0x0114:
            r2 = 1
        L_0x0115:
            java.lang.String r0 = "Required value was null."
            X.1Xj r10 = r7.A0D     // Catch:{ IOException -> 0x0294 }
            if (r2 == 0) goto L_0x011e
            if (r10 == 0) goto L_0x028f
            goto L_0x017b
        L_0x011e:
            if (r10 == 0) goto L_0x028a
            java.lang.String r24 = A00(r7)     // Catch:{ IOException -> 0x0294 }
            java.lang.String r9 = r7.A0N     // Catch:{ IOException -> 0x0294 }
            X.Jw0 r13 = r7.A02     // Catch:{ IOException -> 0x0294 }
            X.0eM r12 = r7.A16     // Catch:{ IOException -> 0x0294 }
            X.6rJ r1 = X.C60296Jiu.A00(r12)     // Catch:{ IOException -> 0x0294 }
            java.lang.String r0 = "IS_PROMO_VIDEO"
            java.lang.Object r8 = r1.A00(r0)     // Catch:{ IOException -> 0x0294 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ IOException -> 0x0294 }
            java.lang.Boolean r5 = r7.A0M     // Catch:{ IOException -> 0x0294 }
            X.6rJ r1 = X.C60296Jiu.A00(r12)     // Catch:{ IOException -> 0x0294 }
            java.lang.String r0 = "IS_CAPTIONS_ENABLED"
            java.lang.Object r4 = r1.A00(r0)     // Catch:{ IOException -> 0x0294 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ IOException -> 0x0294 }
            com.instagram.music.common.model.MusicOverlayStickerModel r3 = r7.A0H     // Catch:{ IOException -> 0x0294 }
            X.6rJ r1 = X.C60296Jiu.A00(r12)     // Catch:{ IOException -> 0x0294 }
            java.lang.String r0 = "IS_CAPTIONS_TRANSLATIONS_TOGGLE_ENABLED"
            java.lang.Object r2 = r1.A00(r0)     // Catch:{ IOException -> 0x0294 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ IOException -> 0x0294 }
            X.Juw r1 = r7.A09     // Catch:{ IOException -> 0x0294 }
            com.instagram.api.schemas.MediaGenAIDetectionMethod r14 = r7.A06     // Catch:{ IOException -> 0x0294 }
            X.6rJ r12 = X.C60296Jiu.A00(r12)     // Catch:{ IOException -> 0x0294 }
            java.lang.String r0 = "IS_STICKER_TRANSLATIONS_TOGGLE_ENABLED"
            java.lang.Object r0 = r12.A00(r0)     // Catch:{ IOException -> 0x0294 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ IOException -> 0x0294 }
            r22 = r2
            r23 = r0
            r25 = r9
            r15 = r6
            r16 = r1
            r17 = r10
            r18 = r3
            r19 = r8
            r20 = r5
            r21 = r4
            X.1OC r1 = X.LSW.A01(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ IOException -> 0x0294 }
            goto L_0x0267
        L_0x017b:
            java.lang.String r31 = A00(r7)     // Catch:{ IOException -> 0x0294 }
            boolean r0 = r7.A0f     // Catch:{ IOException -> 0x0294 }
            r41 = r0
            java.util.List r0 = r7.A15     // Catch:{ IOException -> 0x0294 }
            r26 = r0
            java.util.List r0 = r7.A0P     // Catch:{ IOException -> 0x0294 }
            r23 = r0
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r0 = r7.A05     // Catch:{ IOException -> 0x0294 }
            r22 = r0
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r0 = r7.A04     // Catch:{ IOException -> 0x0294 }
            r20 = r0
            java.lang.String r0 = r7.A0N     // Catch:{ IOException -> 0x0294 }
            r19 = r0
            java.lang.Object r0 = r1.getValue()     // Catch:{ IOException -> 0x0294 }
            X.JiL r0 = (X.C60264JiL) r0     // Catch:{ IOException -> 0x0294 }
            X.2Fj r0 = r0.A0A     // Catch:{ IOException -> 0x0294 }
            java.lang.Object r14 = r0.A02()     // Catch:{ IOException -> 0x0294 }
            java.util.List r14 = (java.util.List) r14     // Catch:{ IOException -> 0x0294 }
            java.util.List r0 = r7.A0O     // Catch:{ IOException -> 0x0294 }
            r18 = r0
            java.lang.Object r0 = r1.getValue()     // Catch:{ IOException -> 0x0294 }
            X.JiL r0 = (X.C60264JiL) r0     // Catch:{ IOException -> 0x0294 }
            X.05G r0 = r0.A0B     // Catch:{ IOException -> 0x0294 }
            java.lang.Object r13 = r0.getValue()     // Catch:{ IOException -> 0x0294 }
            java.util.List r13 = (java.util.List) r13     // Catch:{ IOException -> 0x0294 }
            X.0eM r0 = r7.A18     // Catch:{ IOException -> 0x0294 }
            X.JiG r0 = X.JTT.A0P(r0)     // Catch:{ IOException -> 0x0294 }
            X.2Fk r0 = r0.A00     // Catch:{ IOException -> 0x0294 }
            java.lang.Object r12 = r0.A02()     // Catch:{ IOException -> 0x0294 }
            X.3QO r12 = (X.AnonymousClass3QO) r12     // Catch:{ IOException -> 0x0294 }
            com.instagram.model.venue.Venue r0 = r7.A0G     // Catch:{ IOException -> 0x0294 }
            r24 = r0
            X.Jw0 r0 = r7.A02     // Catch:{ IOException -> 0x0294 }
            r17 = r0
            X.0eM r0 = r7.A16     // Catch:{ IOException -> 0x0294 }
            X.6rJ r3 = X.C60296Jiu.A00(r0)     // Catch:{ IOException -> 0x0294 }
            java.lang.String r2 = "IS_PROMO_VIDEO"
            java.lang.Object r9 = r3.A00(r2)     // Catch:{ IOException -> 0x0294 }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ IOException -> 0x0294 }
            java.lang.Boolean r2 = r7.A0M     // Catch:{ IOException -> 0x0294 }
            r16 = r2
            X.6rJ r3 = X.C60296Jiu.A00(r0)     // Catch:{ IOException -> 0x0294 }
            java.lang.String r2 = "IS_CAPTIONS_ENABLED"
            java.lang.Object r8 = r3.A00(r2)     // Catch:{ IOException -> 0x0294 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ IOException -> 0x0294 }
            com.instagram.music.common.model.MusicOverlayStickerModel r2 = r7.A0H     // Catch:{ IOException -> 0x0294 }
            r25 = r2
            X.0eM r2 = r7.A1A     // Catch:{ IOException -> 0x0294 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ IOException -> 0x0294 }
            X.Jg0 r2 = (X.C60119Jg0) r2     // Catch:{ IOException -> 0x0294 }
            X.2Fk r2 = r2.A00     // Catch:{ IOException -> 0x0294 }
            java.lang.Object r5 = r2.A02()     // Catch:{ IOException -> 0x0294 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0294 }
            X.6rJ r3 = X.C60296Jiu.A00(r0)     // Catch:{ IOException -> 0x0294 }
            java.lang.String r2 = "IS_CAPTIONS_TRANSLATIONS_TOGGLE_ENABLED"
            java.lang.Object r4 = r3.A00(r2)     // Catch:{ IOException -> 0x0294 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ IOException -> 0x0294 }
            java.lang.Object r2 = r1.getValue()     // Catch:{ IOException -> 0x0294 }
            X.JiL r2 = (X.C60264JiL) r2     // Catch:{ IOException -> 0x0294 }
            X.2Fj r2 = r2.A09     // Catch:{ IOException -> 0x0294 }
            java.lang.Object r3 = r2.A02()     // Catch:{ IOException -> 0x0294 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ IOException -> 0x0294 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ IOException -> 0x0294 }
            X.JiL r1 = (X.C60264JiL) r1     // Catch:{ IOException -> 0x0294 }
            X.2Fj r1 = r1.A07     // Catch:{ IOException -> 0x0294 }
            java.lang.Object r2 = r1.A02()     // Catch:{ IOException -> 0x0294 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ IOException -> 0x0294 }
            X.Juw r1 = r7.A09     // Catch:{ IOException -> 0x0294 }
            r21 = r1
            com.instagram.api.schemas.MediaGenAIDetectionMethod r15 = r7.A06     // Catch:{ IOException -> 0x0294 }
            X.6rJ r1 = X.C60296Jiu.A00(r0)     // Catch:{ IOException -> 0x0294 }
            java.lang.String r0 = "IS_STICKER_TRANSLATIONS_TOGGLE_ENABLED"
            java.lang.Object r0 = r1.A00(r0)     // Catch:{ IOException -> 0x0294 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ IOException -> 0x0294 }
            r27 = r16
            r28 = r8
            r29 = r4
            r30 = r0
            r32 = r19
            r33 = r5
            r34 = r26
            r35 = r23
            r36 = r14
            r37 = r18
            r38 = r13
            r39 = r3
            r40 = r2
            r16 = r17
            r17 = r20
            r18 = r22
            r19 = r15
            r20 = r6
            r22 = r10
            r23 = r12
            r26 = r9
            X.1OC r1 = X.LSW.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ IOException -> 0x0294 }
        L_0x0267:
            X.KAQ r0 = new X.KAQ     // Catch:{ IOException -> 0x0294 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0294 }
            r1.A00 = r0     // Catch:{ IOException -> 0x0294 }
            r11.schedule(r1)     // Catch:{ IOException -> 0x0294 }
            X.4jy r0 = r7.A0x     // Catch:{ IOException -> 0x0294 }
            if (r0 == 0) goto L_0x02a8
            java.lang.String r3 = r0.A0C     // Catch:{ IOException -> 0x0294 }
            if (r3 == 0) goto L_0x02a8
            boolean r0 = r7.A0W     // Catch:{ IOException -> 0x0294 }
            if (r0 == 0) goto L_0x02a8
            java.lang.String r2 = r7.A13     // Catch:{ IOException -> 0x0294 }
            r1 = 45
            X.KAf r0 = new X.KAf     // Catch:{ IOException -> 0x0294 }
            r0.<init>(r7, r1)     // Catch:{ IOException -> 0x0294 }
            X.AnonymousClass3YY.A03(r0, r6, r11, r2, r3)     // Catch:{ IOException -> 0x0294 }
            goto L_0x02a8
        L_0x028a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ IOException -> 0x0294 }
            goto L_0x0293
        L_0x028f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ IOException -> 0x0294 }
        L_0x0293:
            throw r0     // Catch:{ IOException -> 0x0294 }
        L_0x0294:
            r1 = move-exception
            java.lang.String r0 = "ClipsEditMetadataController"
            X.0wb.A07(r0, r1)
            X.4DH r0 = r7.A0q
            androidx.fragment.app.FragmentActivity r2 = r0.getActivity()
            java.lang.String r1 = "create_edits_metadata_io_exception"
            r0 = 2131961521(0x7f1326b1, float:1.9559741E38)
            X.C59689JTv.A0F(r2, r1, r0)
        L_0x02a8:
            r0 = 0
            r7.A0Z = r0
            r7.A0V = r0
            r7.A0T = r0
            r7.A0X = r0
            r7.A0W = r0
            r7.A0Y = r0
            r7.A0U = r0
            return
        L_0x02b8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.clips.edit.ClipsEditMetadataController.A0A(instagram.features.clips.edit.ClipsEditMetadataController):void");
    }

    public static final void A0B(ClipsEditMetadataController clipsEditMetadataController) {
        ShoppingCreationConfig shoppingCreationConfig;
        String str;
        K1L k1l = clipsEditMetadataController.A07;
        if (k1l != null) {
            shoppingCreationConfig = k1l.A01;
        } else {
            shoppingCreationConfig = null;
        }
        int i = 0;
        boolean A1V = AnonymousClass7TF.A1V(shoppingCreationConfig);
        C65688Ly3 ly3 = (C65688Ly3) clipsEditMetadataController.A0z;
        MVG mvg = ly3.A00;
        if (mvg == null) {
            str = "viewHolder";
        } else {
            View AqN = mvg.AqN();
            int i2 = 8;
            if (A1V) {
                i2 = 0;
            }
            AqN.setVisibility(i2);
            Group group = clipsEditMetadataController.productTaggingGroup;
            if (group != null) {
                if (!A1V) {
                    i = 8;
                }
                group.setVisibility(i);
                if (A1V) {
                    ly3.A01 = new C65687Ly2(shoppingCreationConfig, clipsEditMetadataController);
                    clipsEditMetadataController.A0y.A01(clipsEditMetadataController.A0D);
                }
                A07(clipsEditMetadataController);
                return;
            }
            str = "productTaggingGroup";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        if (X.2PP.A00(r1, r3.A02) == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b7, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00dc, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x013e, code lost:
        if (r3.A0R == false) goto L_0x0146;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0C(instagram.features.clips.edit.ClipsEditMetadataController r3) {
        /*
            X.1Xj r0 = r3.A0D
            if (r0 == 0) goto L_0x000e
            X.3gp r0 = r0.A1T()
            if (r0 == 0) goto L_0x000e
            java.lang.String r1 = r0.A0d
            if (r1 != 0) goto L_0x0010
        L_0x000e:
            java.lang.String r1 = ""
        L_0x0010:
            java.lang.String r0 = A00(r3)
            boolean r0 = X.C51966G9m.A1a(r1, r0)
            if (r0 != 0) goto L_0x003e
            X.1Xj r0 = r3.A0D
            if (r0 == 0) goto L_0x004f
            X.0eM r0 = r3.A16
            X.6rJ r2 = X.C60296Jiu.A00(r0)
            java.lang.String r1 = "IS_STICKER_TRANSLATIONS_TOGGLE_ENABLED"
            java.lang.Object r0 = r2.A00(r1)
            if (r0 == 0) goto L_0x004f
            java.lang.Object r1 = r2.A00(r1)
            java.lang.String r0 = "IS_STICKER_TRANSLATIONS_ENABLED"
            java.lang.Object r0 = r2.A00(r0)
            if (r0 == 0) goto L_0x014b
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x004f
        L_0x003e:
            boolean r0 = r3.A0b
            if (r0 != 0) goto L_0x0146
            X.K5w r0 = r3.A10
            r1 = 1
        L_0x0045:
            r0.A03 = r1
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x004e
            r0.setEnabled(r1)
        L_0x004e:
            return
        L_0x004f:
            X.1Xj r0 = r3.A0D
            if (r0 == 0) goto L_0x0074
            X.0eM r0 = r3.A16
            X.6rJ r2 = X.C60296Jiu.A00(r0)
            java.lang.String r1 = "IS_CAPTIONS_TRANSLATIONS_TOGGLE_ENABLED"
            java.lang.Object r0 = r2.A00(r1)
            if (r0 == 0) goto L_0x0074
            java.lang.Object r1 = r2.A00(r1)
            java.lang.String r0 = "IS_CAPTIONS_TRANSLATIONS_ENABLED"
            java.lang.Object r0 = r2.A00(r0)
            if (r0 == 0) goto L_0x0150
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0074
            goto L_0x003e
        L_0x0074:
            X.1Xj r0 = r3.A0D
            if (r0 == 0) goto L_0x0095
            X.1sQ r0 = X.C51966G9m.A0n(r0)
            if (r0 == 0) goto L_0x0093
            com.instagram.model.shopping.clips.ClipsShoppingInfoIntf r1 = r0.Btl()
            if (r1 == 0) goto L_0x0093
            X.LSG r0 = X.LSG.A00
            X.Jw0 r1 = r0.A02(r1)
        L_0x008a:
            X.Jw0 r0 = r3.A02
            boolean r0 = X.2PP.A00(r1, r0)
            if (r0 != 0) goto L_0x0095
            goto L_0x003e
        L_0x0093:
            r1 = 0
            goto L_0x008a
        L_0x0095:
            X.1Xj r0 = r3.A0D
            if (r0 == 0) goto L_0x00ba
            X.0eM r0 = r3.A16
            X.6rJ r2 = X.C60296Jiu.A00(r0)
            java.lang.String r1 = "IS_PROMO_VIDEO"
            java.lang.Object r0 = r2.A00(r1)
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r1 = r2.A00(r1)
            java.lang.String r0 = "IS_ORIGINAL_MEDIA_PROMO_VIDEO"
            java.lang.Object r0 = r2.A00(r0)
            if (r0 == 0) goto L_0x0155
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00ba
            goto L_0x003e
        L_0x00ba:
            X.1Xj r0 = r3.A0D
            if (r0 == 0) goto L_0x00e0
            X.0eM r0 = r3.A16
            X.6rJ r2 = X.C60296Jiu.A00(r0)
            java.lang.String r1 = "IS_CAPTIONS_ENABLED"
            java.lang.Object r0 = r2.A00(r1)
            if (r0 == 0) goto L_0x00e0
            java.lang.Object r1 = r2.A00(r1)
            java.lang.String r0 = "IS_ORIGINAL_MEDIA_CAPTIONS_ENABLED"
            java.lang.Object r0 = r2.A00(r0)
            if (r0 == 0) goto L_0x015a
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00e0
            goto L_0x003e
        L_0x00e0:
            boolean r0 = r3.A0Z
            if (r0 != 0) goto L_0x003e
            boolean r0 = r3.A0T
            if (r0 != 0) goto L_0x003e
            boolean r0 = r3.A0X
            if (r0 != 0) goto L_0x003e
            boolean r0 = r3.A0W
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = r3.A0N
            if (r0 != 0) goto L_0x003e
            boolean r0 = r3.A0H()
            if (r0 != 0) goto L_0x003e
            X.0eM r0 = r3.A1B
            java.lang.Object r0 = r0.getValue()
            X.Jg9 r0 = (X.C60128Jg9) r0
            X.2Fk r0 = r0.A00
            java.lang.Object r0 = r0.A02()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0112
            int r0 = r0.length()
            if (r0 != 0) goto L_0x003e
        L_0x0112:
            java.lang.Boolean r1 = r3.A0M
            X.1Xj r0 = r3.A0D
            if (r0 == 0) goto L_0x0144
            java.lang.Boolean r0 = r0.A2E()
        L_0x011c:
            boolean r0 = X.2PP.A00(r1, r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x003e
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r3.A0H
            if (r0 != 0) goto L_0x003e
            boolean r0 = r3.A0Y
            if (r0 != 0) goto L_0x003e
            boolean r0 = r3.A0U
            if (r0 != 0) goto L_0x003e
            X.1Xj r0 = r3.A0D
            if (r0 == 0) goto L_0x0142
            com.instagram.api.schemas.MediaGenAIDetectionMethod r1 = r0.A1I()
        L_0x0138:
            com.instagram.api.schemas.MediaGenAIDetectionMethod r0 = r3.A06
            if (r1 != r0) goto L_0x003e
            boolean r0 = r3.A0R
            if (r0 == 0) goto L_0x0146
            goto L_0x003e
        L_0x0142:
            r1 = 0
            goto L_0x0138
        L_0x0144:
            r0 = 0
            goto L_0x011c
        L_0x0146:
            X.K5w r0 = r3.A10
            r1 = 0
            goto L_0x0045
        L_0x014b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0150:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0155:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x015a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.clips.edit.ClipsEditMetadataController.A0C(instagram.features.clips.edit.ClipsEditMetadataController):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r6.length() == 0) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0D(instagram.features.clips.edit.ClipsEditMetadataController r5, java.lang.String r6) {
        /*
            android.view.View r2 = r5.metaVerifiedAddLinkRow
            if (r2 == 0) goto L_0x006f
            r1 = 15
            X.LXK r0 = new X.LXK
            r0.<init>(r6, r5, r1)
            X.AnonymousClass0fU.A00(r0, r2)
            r4 = 0
            if (r6 == 0) goto L_0x0018
            int r1 = r6.length()
            r0 = 0
            if (r1 != 0) goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            r3 = 8
            android.widget.TextView r2 = r5.metaVerifiedAddLinkRowTitleTextView
            if (r0 != 0) goto L_0x0046
            if (r2 == 0) goto L_0x006c
            android.content.Context r1 = r5.A0n
            r0 = 2131955506(0x7f130f32, float:1.9547541E38)
            X.DbT.A18(r1, r2, r0)
            android.widget.TextView r0 = r5.metaVerifiedAddLinkRowSubtitleTextView
            if (r0 == 0) goto L_0x0069
            r0.setText(r6)
            android.widget.TextView r0 = r5.metaVerifiedAddLinkRowSubtitleTextView
            if (r0 == 0) goto L_0x0069
            r0.setVisibility(r4)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r5.metaVerifiedAddLinkRowChevronIconView
            if (r0 == 0) goto L_0x0072
            r0.setVisibility(r3)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r5.metaVerifiedAddLinkRowClearButtonView
            if (r0 == 0) goto L_0x0066
            r0.setVisibility(r4)
            return
        L_0x0046:
            if (r2 == 0) goto L_0x006c
            android.content.Context r1 = r5.A0n
            r0 = 2131955505(0x7f130f31, float:1.954754E38)
            X.DbT.A18(r1, r2, r0)
            android.widget.TextView r0 = r5.metaVerifiedAddLinkRowSubtitleTextView
            if (r0 == 0) goto L_0x0069
            r0.setVisibility(r3)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r5.metaVerifiedAddLinkRowChevronIconView
            if (r0 == 0) goto L_0x0072
            r0.setVisibility(r4)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r5.metaVerifiedAddLinkRowClearButtonView
            if (r0 == 0) goto L_0x0066
            r0.setVisibility(r3)
            return
        L_0x0066:
            java.lang.String r0 = "metaVerifiedAddLinkRowClearButtonView"
            goto L_0x0074
        L_0x0069:
            java.lang.String r0 = "metaVerifiedAddLinkRowSubtitleTextView"
            goto L_0x0074
        L_0x006c:
            java.lang.String r0 = "metaVerifiedAddLinkRowTitleTextView"
            goto L_0x0074
        L_0x006f:
            java.lang.String r0 = "metaVerifiedAddLinkRow"
            goto L_0x0074
        L_0x0072:
            java.lang.String r0 = "metaVerifiedAddLinkRowChevronIconView"
        L_0x0074:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.clips.edit.ClipsEditMetadataController.A0D(instagram.features.clips.edit.ClipsEditMetadataController, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (X.AnonymousClass7TE.A1b(r8) != true) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0E(instagram.features.clips.edit.ClipsEditMetadataController r7, java.util.List r8, java.util.List r9) {
        /*
            com.instagram.common.session.UserSession r3 = r7.A0s
            r5 = 0
            X.0Tu r2 = X.0Tu.A06
            r0 = 36321108199154800(0x8109db000f2470, double:3.032953306284546E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r3 = r0 ^ 1
            r6 = 1
            if (r8 == 0) goto L_0x001a
            boolean r1 = X.AnonymousClass7TE.A1b(r8)
            r0 = 1
            if (r1 == r6) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            java.lang.String r2 = "Required value was null."
            if (r0 != 0) goto L_0x0029
            if (r9 == 0) goto L_0x0076
            boolean r0 = X.AnonymousClass7TE.A1b(r9)
            if (r0 != r6) goto L_0x0076
            if (r3 == 0) goto L_0x0076
        L_0x0029:
            int r4 = X.C51971G9r.A0H(r8)
            if (r3 == 0) goto L_0x0034
            int r0 = X.C51971G9r.A0H(r9)
            int r4 = r4 + r0
        L_0x0034:
            android.widget.TextView r3 = r7.taggedPeopleTextView
            if (r3 == 0) goto L_0x0071
            if (r4 != r6) goto L_0x0061
            if (r8 == 0) goto L_0x004a
            java.lang.Object r0 = X.00k.A0O(r8, r5)
            com.instagram.model.people.PeopleTag r0 = (com.instagram.model.people.PeopleTag) r0
            if (r0 == 0) goto L_0x004a
            com.instagram.model.people.PeopleTag$UserInfo r0 = r0.A00
            java.lang.String r0 = r0.A04
            if (r0 != 0) goto L_0x0058
        L_0x004a:
            if (r9 == 0) goto L_0x005f
            java.lang.Object r0 = X.00k.A0O(r9, r5)
            com.instagram.model.fbusertag.FBUserTag r0 = (com.instagram.model.fbusertag.FBUserTag) r0
            if (r0 == 0) goto L_0x005f
            com.instagram.model.fbusertag.FBUserTag$FBUserInfo r0 = r0.A02
            java.lang.String r0 = r0.A01
        L_0x0058:
            r3.setText(r0)
            r3.setVisibility(r5)
            return
        L_0x005f:
            r0 = 0
            goto L_0x0058
        L_0x0061:
            android.content.Context r2 = r3.getContext()
            r1 = 2131969354(0x7f13454a, float:1.9575628E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = X.DbW.A0h(r2, r0, r1)
            goto L_0x0058
        L_0x0071:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0076:
            android.widget.TextView r1 = r7.taggedPeopleTextView
            if (r1 == 0) goto L_0x0080
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0080:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.clips.edit.ClipsEditMetadataController.A0E(instagram.features.clips.edit.ClipsEditMetadataController, java.util.List, java.util.List):void");
    }

    public static final void A0F(ClipsEditMetadataController clipsEditMetadataController, boolean z) {
        String str;
        LM3 lm3 = clipsEditMetadataController.A0C;
        if (lm3 != null) {
            LM3.A00(lm3, 2131961822, 2131961793);
        } else if (clipsEditMetadataController.A0f || AnonymousClass7TE.A1b(clipsEditMetadataController.A0P)) {
            C358248ab A0Y2 = DbS.A0Y(clipsEditMetadataController.A0n);
            int i = 2131963724;
            if (z) {
                i = 2131963722;
            }
            A0Y2.A09(i);
            int i2 = 2131963723;
            if (z) {
                i2 = 2131963721;
            }
            A0Y2.A08(i2);
            Dba.A1L(A0Y2);
        } else {
            C61402K5w k5w = clipsEditMetadataController.A11;
            FragmentActivity requireActivity = k5w.requireActivity();
            UserSession A0l2 = AnonymousClass7TE.A0l(k5w.A07);
            ClipsEditMetadataController clipsEditMetadataController2 = k5w.A01;
            if (clipsEditMetadataController2 == null) {
                str = "clipsEditMetadataController";
            } else {
                String str2 = clipsEditMetadataController2.A0N;
                String str3 = k5w.A02;
                if (str3 == null) {
                    str = "mediaId";
                } else {
                    0qQ.A0B(A0l2, 1);
                    Bundle A092 = DbY.A09(A0l2);
                    A092.putString("ClipsConstants.ARG_CLIPS_FUNDED_CONTENT_DEAL_ID", str2);
                    A092.putBoolean("ClipsConstants.ARG_CLIPS_SHOULD_SHOW_BONUSES_DEAL", z);
                    A092.putString(AnonymousClass000.A00(99), str3);
                    DbS.A0b(requireActivity, A092, A0l2, ModalActivity.class, C273654mx.A00(925)).A0A(requireActivity, 98);
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A0G(ClipsEditMetadataController clipsEditMetadataController, boolean z) {
        clipsEditMetadataController.A0c = z;
        clipsEditMetadataController.A1D.setIsLoading(z);
    }

    private final boolean A0H() {
        BrandedContentGatingInfoIntf brandedContentGatingInfoIntf;
        if (this.A0m != this.A0f || !0qQ.A0K(this.A15, this.A0P)) {
            return true;
        }
        1Xj r0 = this.A0D;
        if (r0 != null) {
            brandedContentGatingInfoIntf = r0.A0C.BQ3();
        } else {
            brandedContentGatingInfoIntf = null;
        }
        if (!0qQ.A0K(brandedContentGatingInfoIntf, this.A04)) {
            return true;
        }
        BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf = this.A05;
        if (brandedContentProjectMetadataIntf == null || brandedContentProjectMetadataIntf.equals(this.A0i)) {
            return false;
        }
        return true;
    }

    public final View A0I() {
        View view2 = this.view;
        if (view2 != null) {
            return view2;
        }
        0qQ.A0F("view");
        throw AnonymousClass00P.createAndThrow();
    }

    public final IgAutoCompleteTextView A0J() {
        IgAutoCompleteTextView igAutoCompleteTextView = this.A0J;
        if (igAutoCompleteTextView != null) {
            return igAutoCompleteTextView;
        }
        0qQ.A0F("captionInputTextView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0K() {
        C64700LgV lgV = this.A0j;
        if (lgV == null) {
            0qQ.A0F("locationSuggestionsRepository");
            throw AnonymousClass00P.createAndThrow();
        } else {
            lgV.A05.removeLocationUpdates(lgV.A03, lgV);
        }
    }

    public final void D1w() {
        LOe lOe = this.locationSuggestionsRow;
        if (lOe != null) {
            C60409Jl2 jl2 = lOe.A04;
            jl2.A00.clear();
            jl2.notifyDataSetChanged();
            return;
        }
        0qQ.A0F("locationSuggestionsRow");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DOl() {
        C309516Yo A0M2 = DbS.A0M(this.A0q.requireActivity(), this.A0s);
        AnonymousClass36R.A01();
        A0M2.A0B((Bundle) null, K5H.A00((Location) null, "CLIPS", (String) null, -1, true, false));
        A0M2.A04();
    }

    public final void onCreate() {
        AnonymousClass1Nd.A00(this.A0s).A01(this.A1E, C64646LfY.class);
    }

    public final void onDestroy() {
        AnonymousClass1Nd.A00(this.A0s).A02(this.A1E, C64646LfY.class);
    }

    public final void onDestroyView() {
        0nc r1 = this.A08;
        if (r1 != null) {
            r1.cancel(true);
        }
        A0K();
        C64700LgV lgV = this.A0j;
        if (lgV == null) {
            0qQ.A0F("locationSuggestionsRepository");
            throw AnonymousClass00P.createAndThrow();
        }
        lgV.A01();
        ClipsEditMetadataControllerLifecycleUtil.cleanupReferences(this);
        Map map = C60296Jiu.A00(this.A16).A04;
        map.remove("IS_ORIGINAL_MEDIA_PROMO_VIDEO");
        map.remove("IS_ORIGINAL_MEDIA_WELCOME_VIDEO");
        map.remove("IS_PROMO_VIDEO");
        map.remove("IS_ORIGINAL_MEDIA_CAPTIONS_ENABLED");
        map.remove("IS_CAPTIONS_ENABLED");
        map.remove("IS_EXCLUSIVE_CONTENT");
        map.remove("IS_CAPTIONS_TRANSLATIONS_ENABLED");
        map.remove("IS_CAPTIONS_TRANSLATIONS_TOGGLE_ENABLED");
        map.remove("IS_STICKER_TRANSLATIONS_ENABLED");
        map.remove("REEL_CONTAINS_STICKER_TRANSLATIONS");
        map.remove("IS_STICKER_TRANSLATIONS_TOGGLE_ENABLED");
        map.remove("IS_TRIAL_REEL");
        C357128Wq r0 = this.A0K;
        if (r0 != null) {
            r0.A05();
        }
        this.A0K = null;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, androidx.fragment.app.Fragment, X.4DH] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ClipsEditMetadataController(X.AnonymousClass4DH r6, X.AnonymousClass0iw r7, com.instagram.common.session.UserSession r8, X.C272024jy r9, X.C61402K5w r10, X.C61402K5w r11, java.lang.String r12) {
        /*
            r5 = this;
            boolean r2 = X.DbW.A1Z(r8)
            r5.<init>()
            r5.A0q = r6
            r5.A11 = r10
            r5.A0s = r8
            r5.A0r = r7
            r5.A13 = r12
            r5.A10 = r11
            r5.A0x = r9
            android.content.Context r4 = r6.requireContext()
            r5.A0n = r4
            X.1ET r0 = X.1ES.A01()
            r5.A1F = r0
            X.1ET r0 = X.1ES.A01()
            r5.A0t = r0
            com.instagram.monetization.repository.MonetizationRepository r1 = X.AnonymousClass2o3.A00(r8)
            r5.A0v = r1
            X.LFB r0 = new X.LFB
            r0.<init>(r4, r8, r1)
            r5.A0w = r0
            java.lang.Integer r1 = X.JTS.A0e(r8)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            r5.A1C = r0
            com.instagram.incentiveplatform.api.IncentivePlatformApi r0 = X.C63305Kuo.A00(r8)
            r5.A1G = r0
            X.FYh r0 = X.C63304Kun.A00(r8)
            r5.A0u = r0
            X.2dY r0 = X.2dZ.A0t
            X.2dZ r0 = X.DbU.A0L(r6, r0)
            r5.A1D = r0
            java.lang.String r3 = X.AnonymousClass7TG.A0j()
            r5.A14 = r3
            X.3kF r1 = X.C249713kF.A00
            r0 = 0
            X.VjS r0 = r1.A04(r0, r7, r8, r3)
            r5.A0y = r0
            X.L7S r0 = new X.L7S
            r0.<init>(r7, r8, r3)
            r5.A12 = r0
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r5.A0o = r0
            X.3kF r1 = X.C249713kF.A00
            X.0gy r0 = X.AnonymousClass07i.A00(r6)
            X.MUF r0 = r1.A0U(r4, r0, r8)
            r5.A0z = r0
            r0 = 32
            X.0t0 r0 = X.MMH.A00(r5, r0)
            r5.A19 = r0
            r0 = 31
            X.0t0 r0 = X.MMH.A00(r5, r0)
            r5.A18 = r0
            r0 = 34
            X.0t0 r0 = X.MMH.A00(r5, r0)
            r5.A1B = r0
            r0 = 29
            X.0t0 r0 = X.MMH.A00(r5, r0)
            r5.A16 = r0
            r0 = 33
            X.0t0 r0 = X.MMH.A00(r5, r0)
            r5.A1A = r0
            r0 = 30
            X.0t0 r0 = X.MMH.A00(r5, r0)
            r5.A17 = r0
            X.0sn r1 = X.0sn.A00
            r5.A0O = r1
            r5.A0d = r2
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r5.A15 = r0
            r5.A0P = r1
            r4 = 24
            X.LWP r0 = new X.LWP
            r0.<init>((java.lang.Object) r5, (int) r4)
            r5.A0p = r0
            r1 = 16
            X.LgJ r0 = new X.LgJ
            r0.<init>(r5, r1)
            r5.A1E = r0
            X.0eM r0 = r5.A19
            java.lang.Object r0 = r0.getValue()
            X.JiL r0 = (X.C60264JiL) r0
            X.2Fj r2 = r0.A0A
            r1 = 20
            X.J6f r0 = new X.J6f
            r0.<init>(r5, r1)
            r3 = 12
            X.C64321LZw.A00(r6, r2, r0, r3)
            X.0eM r0 = r5.A19
            java.lang.Object r0 = r0.getValue()
            X.JiL r0 = (X.C60264JiL) r0
            X.2Fj r2 = r0.A08
            r1 = 21
            X.J6f r0 = new X.J6f
            r0.<init>(r5, r1)
            X.C64321LZw.A00(r6, r2, r0, r3)
            X.0eM r0 = r5.A19
            java.lang.Object r0 = r0.getValue()
            X.JiL r0 = (X.C60264JiL) r0
            X.2Fj r2 = r0.A09
            r1 = 22
            X.J6f r0 = new X.J6f
            r0.<init>(r5, r1)
            X.C64321LZw.A00(r6, r2, r0, r3)
            X.0eM r0 = r5.A1B
            java.lang.Object r0 = r0.getValue()
            X.Jg9 r0 = (X.C60128Jg9) r0
            X.2Fk r2 = r0.A00
            r1 = 23
            X.J6f r0 = new X.J6f
            r0.<init>(r5, r1)
            X.C64321LZw.A00(r6, r2, r0, r3)
            X.0eM r0 = r5.A1A
            java.lang.Object r0 = r0.getValue()
            X.Jg0 r0 = (X.C60119Jg0) r0
            X.2Fk r1 = r0.A00
            X.J6f r0 = new X.J6f
            r0.<init>(r5, r4)
            X.C64321LZw.A00(r6, r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.clips.edit.ClipsEditMetadataController.<init>(X.4DH, X.0iw, com.instagram.common.session.UserSession, X.4jy, X.K5w, X.K5w, java.lang.String):void");
    }

    public static final String A00(ClipsEditMetadataController clipsEditMetadataController) {
        String obj;
        Editable text = clipsEditMetadataController.A0J().getText();
        if (text == null || (obj = text.toString()) == null) {
            return "";
        }
        return obj;
    }

    public static final void A07(ClipsEditMetadataController clipsEditMetadataController) {
        K1L k1l;
        List list;
        String A012;
        clipsEditMetadataController.A02();
        TextView textView = clipsEditMetadataController.A0h;
        if (textView != null && (k1l = clipsEditMetadataController.A07) != null) {
            C63801L7h l7h = k1l.A00;
            if (l7h != null) {
                list = l7h.A02;
                A012 = l7h.A00;
                if (A012 != null) {
                    if (l7h.A03) {
                        A012 = clipsEditMetadataController.A0n.getString(2131968496);
                    }
                }
                String str = clipsEditMetadataController.A0N;
                if (str == null || list == null || (A012 = F5M.A01(str, list)) == null) {
                    textView.setText(2131968496);
                    A0C(clipsEditMetadataController);
                }
            } else {
                list = null;
                String str2 = clipsEditMetadataController.A0N;
                textView.setText(2131968496);
                A0C(clipsEditMetadataController);
            }
            textView.setText(A012);
            A0C(clipsEditMetadataController);
        }
    }

    public final void DOm(Venue venue) {
        LDQ ldq;
        A05(venue, this);
        if (!(venue == null || (ldq = this.A0A) == null)) {
            ldq.A00(venue);
        }
        A0K();
    }
}
