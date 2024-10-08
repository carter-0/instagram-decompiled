package X;

import android.view.View;

public final class H8M extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ GHH A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ 0r1 A06;
    public final /* synthetic */ 0rm A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;

    public final void run() {
        GHH ghh = this.A02;
        02m r4 = ghh.A01;
        int i = this.A01;
        r4.markerStart(757799646, i);
        r4.markerAnnotate(757799646, i, "ad_id", this.A03);
        r4.markerAnnotate(757799646, i, "is_eligible_for_captions", this.A09);
        r4.markerAnnotate(757799646, i, "is_litho", this.A06.A00);
        r4.markerAnnotate(757799646, i, AnonymousClass000.A00(538), this.A04);
        r4.markerAnnotate(757799646, i, AnonymousClass000.A00(5374), this.A05);
        r4.markerAnnotate(757799646, i, "is_video_subtitles_enabled_for_media", this.A0C);
        r4.markerAnnotate(757799646, i, "is_video_subtitles_auto_generated", this.A0B);
        r4.markerAnnotate(757799646, i, "is_media_video", this.A0A);
        r4.markerAnnotate(757799646, i, "is_audio_enabled", this.A08);
        r4.markerAnnotate(757799646, i, "subtitle_view_alpha", String.valueOf(((View) this.A07.A00).getAlpha()));
        r4.markerAnnotate(757799646, i, "item_position", this.A00);
        r4.markerAnnotate(757799646, i, "session_key", ghh.A04);
        r4.markerEnd(757799646, i, 2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H8M(GHH ghh, String str, String str2, String str3, 0r1 r9, 0rm r10, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(1499169036, 3, false, false);
        this.A02 = ghh;
        this.A01 = i;
        this.A03 = str;
        this.A09 = z;
        this.A06 = r9;
        this.A04 = str2;
        this.A05 = str3;
        this.A0C = z2;
        this.A0B = z3;
        this.A0A = z4;
        this.A08 = z5;
        this.A07 = r10;
        this.A00 = i2;
    }
}
