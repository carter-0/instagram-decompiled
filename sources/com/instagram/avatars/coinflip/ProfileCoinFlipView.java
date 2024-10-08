package com.instagram.avatars.coinflip;

import X.00k;
import X.0qQ;
import X.0sn;
import X.AnonymousClass0iw;
import X.C320946tJ;
import X.C321016tR;
import X.C321216tl;
import X.C3254672n;
import X.C377199Kx;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ProfileCoinFlipView extends C3254672n {
    public float A00;
    public C320946tJ A01;
    public List A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProfileCoinFlipView(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [com.instagram.avatars.coinflip.CoinFlipAvatarImageView, android.view.View] */
    public final void A0F(C320946tJ r5) {
        if (this.A01 != r5) {
            this.A01 = r5;
            int ordinal = r5.ordinal();
            if (ordinal == 0) {
                A0E();
                this.A03.setVisibility(0);
                this.A02.setVisibility(4);
                this.A01.setVisibility(4);
            } else if (ordinal != 1) {
                throw new RuntimeException();
            } else if (!this.A02.isEmpty()) {
                C321016tR r1 = (C321016tR) 00k.A0O(this.A02, 0);
                if (!(r1 == null || r1.A0L)) {
                    r1.A0L = true;
                    r1.invalidateSelf();
                }
                setAvatarImageDrawable((Drawable) 00k.A0O(this.A02, 0));
            }
        }
    }

    public final void setAvatarDrawables(List list) {
        0qQ.A0B(list, 0);
        this.A02 = list;
    }

    public void setProfilePicUrl(ImageUrl imageUrl, AnonymousClass0iw r4) {
        0qQ.A0B(imageUrl, 0);
        0qQ.A0B(r4, 1);
        this.A03.A0E = new C321216tl(this);
        super.setProfilePicUrl(imageUrl, r4);
    }

    public static final void A00(ProfileCoinFlipView profileCoinFlipView) {
        C321016tR r0;
        if (profileCoinFlipView.A02.size() > 1 && (r0 = (C321016tR) 00k.A0O(profileCoinFlipView.A02, 1)) != null) {
            r0.A06();
            profileCoinFlipView.setAvatarImageDrawable(r0);
        }
    }

    public final void A0D() {
        C321016tR r2 = (C321016tR) 00k.A0O(this.A02, 0);
        if (r2 != null) {
            A0E();
            r2.A0I = new C377199Kx(this, 32);
            r2.A0A(1);
            r2.A08();
        }
    }

    public final void A0E() {
        C321016tR r0;
        if ((!this.A02.isEmpty()) && (r0 = (C321016tR) 00k.A0O(this.A02, 0)) != null) {
            r0.A06();
        }
    }

    public final List getAvatarDrawables() {
        return this.A02;
    }

    public final C320946tJ getCurrentSide() {
        return this.A01;
    }

    public final float getInitialScale() {
        return this.A00;
    }

    public final void setInitialScale(float f) {
        this.A00 = f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileCoinFlipView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileCoinFlipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        setWillNotDraw(false);
        View.inflate(context, R.layout.coin_flip_layout, this);
        this.A03 = findViewById(R.id.profilePic);
        this.A01 = (CoinFlipAvatarImageView) findViewById(R.id.avatar);
        this.A02 = findViewById(R.id.circle_background);
        this.A00 = (ConstraintLayout) findViewById(R.id.coin_flip_layout);
        this.A04 = "";
        this.A00 = 1.0f;
        this.A02 = 0sn.A00;
        this.A01 = C320946tJ.PROFILE_PICTURE;
    }
}
