package com.instagram.debug.devoptions.signalsplayground.view;

import X.0qQ;
import X.AnonymousClass0fU;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C249703kE;
import X.C48116EWi;
import X.DbS;
import X.DbU;
import X.DbX;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQueryResponse;

public final class CreatorInspirationSignalsPlaygroundSignalRowViewHolder extends C249703kE {
    public final Delegate delegate;
    public final RoundedCornerImageView signalImageView;
    public final ConstraintLayout signalRowContainer;
    public final IgTextView signalSubtitle;
    public final IgTextView signalTitle;

    public interface Delegate {
        void onSignalRowClick(CreatorInspirationSignalsPlaygroundSignalsQueryResponse.XdtGetCreatorsSignalPlayground.Signals signals);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C48116EWi.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.widget.ImageView] */
    public final void bind(CreatorInspirationSignalsPlaygroundSignalsQueryResponse.XdtGetCreatorsSignalPlayground.Signals signals) {
        0qQ.A0B(signals, 0);
        Integer iconDrawableResByType = getIconDrawableResByType(signals.getEntityTypeV2());
        if (iconDrawableResByType != null) {
            int intValue = iconDrawableResByType.intValue();
            DbU.A13(DbS.A07(this), this.signalImageView, intValue);
        }
        this.signalTitle.setText(signals.getDisplayName());
        this.signalSubtitle.setText(signals.getIdentifier());
        AnonymousClass0fU.A00(new CreatorInspirationSignalsPlaygroundSignalRowViewHolder$bind$2(this, signals), this.signalRowContainer);
    }

    private final Integer getIconDrawableResByType(C48116EWi eWi) {
        int i;
        if (eWi == null) {
            return null;
        }
        int ordinal = eWi.ordinal();
        if (ordinal == 2) {
            i = R.drawable.instagram_music_pano_outline_24;
        } else if (ordinal == 3) {
            i = R.drawable.instagram_reels_pano_outline_24;
        } else if (ordinal != 1) {
            return null;
        } else {
            i = R.drawable.instagram_users_pano_outline_24;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundSignalRowViewHolder(View view, Delegate delegate2) {
        super(view);
        AnonymousClass7TG.A1O(view, delegate2);
        this.delegate = delegate2;
        this.signalRowContainer = (ConstraintLayout) AnonymousClass7TF.A0F(view, R.id.signal_row_container);
        this.signalImageView = (RoundedCornerImageView) AnonymousClass7TF.A0F(view, R.id.signal_image);
        this.signalTitle = DbX.A0Z(view, R.id.signal_title);
        this.signalSubtitle = DbX.A0Z(view, R.id.signal_subtitle);
    }
}
