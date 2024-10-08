package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import com.google.common.collect.ImmutableList;
import com.instagram.ar.features.effectspage.models.EffectsPageModel;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.media.EffectPreview;
import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;
import java.util.Collection;
import java.util.List;

/* renamed from: X.IdQ  reason: case insensitive filesystem */
public final /* synthetic */ class C57599IdQ implements C59564JOk {
    public final /* synthetic */ EffectsPageFragment A00;

    public /* synthetic */ C57599IdQ(EffectsPageFragment effectsPageFragment) {
        this.A00 = effectsPageFragment;
    }

    public final void DoI(C54193H2n h2n) {
        C55442Hhm hhm;
        List list;
        ImmutableList copyOf;
        EffectPreview effectPreview;
        EffectsPageFragment effectsPageFragment = this.A00;
        C54193H2n h2n2 = h2n;
        effectsPageFragment.A0M = h2n2.A03;
        effectsPageFragment.A02 = h2n2.A00;
        C55443Hhn hhn = h2n2.A01;
        if (hhn == null || (hhm = hhn.A00) == null || (list = hhm.A00) == null || (copyOf = ImmutableList.copyOf((Collection) list)) == null || copyOf.isEmpty() || (effectPreview = (EffectPreview) AnonymousClass7TE.A13(copyOf)) == null) {
            EffectsPageFragment.A05(effectsPageFragment, 2131955456);
            return;
        }
        String A02 = DDx.A02(effectPreview);
        String A03 = DDx.A03(effectPreview);
        ImageUrl A002 = DDx.A00(effectPreview);
        String str = effectPreview.A0A;
        String str2 = effectPreview.A0B;
        String str3 = h2n2.A02;
        String saveStatus = effectPreview.getSaveStatus();
        String str4 = str2;
        effectsPageFragment.A03 = new EffectsPageModel((EffectAttribution) null, A002, (Integer) null, (Integer) null, (Integer) null, (Integer) null, A02, A03, str, (String) null, "", str4, str3, (String) null, DDx.A05(effectPreview), !DDx.A04(effectPreview), "SAVED".equals(saveStatus), !MessageAvailabilityResponseId$Companion.NOT_SUPPORTED.equals(saveStatus), true, true, true, effectsPageFragment.A0L);
        EffectsPageFragment.A03(effectsPageFragment);
        effectsPageFragment.configureActionBar(2dZ.A0t.A03(effectsPageFragment.getActivity()));
        EffectsPageFragment.A04(effectsPageFragment);
    }
}
