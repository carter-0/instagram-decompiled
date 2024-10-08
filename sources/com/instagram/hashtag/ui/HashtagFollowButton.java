package com.instagram.hashtag.ui;

import X.0qQ;
import X.0yU;
import X.AnonymousClass05K;
import X.AnonymousClass0iw;
import X.AnonymousClass0yP;
import X.C20953X6g;
import X.C281965Ag;
import X.G5n;
import X.WA5;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.ui.widget.textview.UpdatableButton;

public class HashtagFollowButton extends UpdatableButton {
    public G5n A00;
    public String A01;

    public HashtagFollowButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void A01(AnonymousClass0iw r7, C20953X6g x6g, Hashtag hashtag) {
        Hashtag hashtag2 = hashtag;
        0qQ.A0B(hashtag, 0);
        boolean A03 = C281965Ag.A03(hashtag);
        G5n g5n = this.A00;
        if (g5n != null) {
            g5n.DIm(hashtag);
        }
        if (0yU.A07(AnonymousClass0yP.A00(36330041730154918L))) {
            A00(this, "", A03);
            return;
        }
        if (hashtag.getName() != null) {
            A00(this, hashtag.getName(), A03);
        }
        setOnClickListener(new WA5(r7, x6g, this, hashtag2, A03));
    }

    public static void A00(HashtagFollowButton hashtagFollowButton, String str, boolean z) {
        int i;
        if (0yU.A07(AnonymousClass0yP.A00(36330041730154918L))) {
            hashtagFollowButton.setVisibility(8);
            hashtagFollowButton.A01 = AnonymousClass05K.A0C;
            return;
        }
        hashtagFollowButton.setIsBlueButton(!z);
        hashtagFollowButton.refreshDrawableState();
        hashtagFollowButton.setEnabled(true);
        Resources resources = hashtagFollowButton.getContext().getResources();
        int i2 = 2131962615;
        if (z) {
            i2 = 2131962617;
        }
        hashtagFollowButton.setContentDescription(resources.getString(i2, new Object[]{str}));
        if (z) {
            i = 2131962616;
        } else if (!TextUtils.isEmpty(hashtagFollowButton.A01)) {
            hashtagFollowButton.setText(hashtagFollowButton.A01);
            return;
        } else {
            i = 2131962612;
        }
        hashtagFollowButton.setText(i);
    }

    public void setCustomFollowText(String str) {
        this.A01 = str;
    }

    public void setHashtagUpdateListener(G5n g5n) {
        this.A00 = g5n;
    }

    public HashtagFollowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public HashtagFollowButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
