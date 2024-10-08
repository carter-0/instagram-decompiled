package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.hashtag.ImmutablePandoHashtag;

/* renamed from: X.Vjz  reason: case insensitive filesystem */
public final class C18023Vjz {
    public ImageUrl A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public final Hashtag A0G;

    public C18023Vjz(Hashtag hashtag) {
        0qQ.A0B(hashtag, 1);
        this.A0G = hashtag;
        this.A01 = hashtag.Ab5();
        this.A02 = hashtag.Ab8();
        this.A08 = hashtag.B6q();
        this.A09 = hashtag.B6z();
        this.A0B = hashtag.B7j();
        this.A03 = hashtag.BDK();
        this.A0C = hashtag.getId();
        this.A04 = hashtag.CSN();
        this.A05 = hashtag.CWZ();
        this.A0A = hashtag.BPt();
        this.A0D = hashtag.getName();
        this.A06 = hashtag.BWU();
        this.A00 = hashtag.Bh3();
        this.A0E = hashtag.BqG();
        this.A0F = hashtag.BqN();
        this.A07 = hashtag.CCV();
    }

    public final Hashtag A00() {
        Object A012;
        String str;
        Hashtag hashtag = this.A0G;
        if (hashtag instanceof ImmutablePandoHashtag) {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            0eP r0 = new 0eP("allow_following", this.A01);
            0eP r02 = new 0eP("allow_muting_story", this.A02);
            0eP r03 = new 0eP("follow_status", this.A08);
            0eP r14 = new 0eP("following", this.A09);
            0eP r13 = new 0eP("formatted_media_count", this.A0B);
            0eP r12 = new 0eP("hide_use_hashtag_button", this.A03);
            0eP r10 = new 0eP(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A0C);
            0eP r9 = new 0eP("is_eligible_for_survey", this.A04);
            0eP r8 = new 0eP("is_local", this.A05);
            0eP r7 = new 0eP("media_count", this.A0A);
            0eP r6 = new 0eP(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A0D);
            0eP r5 = new 0eP("non_violating", this.A06);
            ImageUrl imageUrl = this.A00;
            if (imageUrl != null) {
                str = imageUrl.getUrl();
            } else {
                str = null;
            }
            0eP r4 = new 0eP("profile_pic_url", str);
            0eP r28 = r6;
            0eP r29 = r5;
            0eP r30 = r4;
            0eP r25 = r9;
            0eP r26 = r8;
            0eP r27 = r7;
            0eP r22 = r13;
            0eP r23 = r12;
            0eP r24 = r10;
            0eP r19 = r02;
            0eP r20 = r03;
            0eP r21 = r14;
            A012 = C41847B3o.A0o(hashtag, new 0eP[]{r0, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, new 0eP("search_result_subtitle", this.A0E), new 0eP("search_subtitle", this.A0F), new 0eP("use_default_avatar", this.A07)});
        } else {
            A012 = A01();
        }
        return (Hashtag) A012;
    }

    public final HashtagImpl A01() {
        Boolean bool = this.A01;
        Boolean bool2 = this.A02;
        Integer num = this.A08;
        Integer num2 = this.A09;
        String str = this.A0B;
        Boolean bool3 = this.A03;
        String str2 = this.A0C;
        Boolean bool4 = this.A04;
        Boolean bool5 = this.A05;
        Integer num3 = this.A0A;
        String str3 = this.A0D;
        Boolean bool6 = this.A06;
        ImageUrl imageUrl = this.A00;
        String str4 = this.A0E;
        String str5 = this.A0F;
        String str6 = str4;
        String str7 = str3;
        String str8 = str2;
        String str9 = str;
        Integer num4 = num3;
        Integer num5 = num2;
        Integer num6 = num;
        return new HashtagImpl(imageUrl, bool, bool2, bool3, bool4, bool5, bool6, this.A07, num6, num5, num4, str9, str8, str7, str6, str5);
    }
}
