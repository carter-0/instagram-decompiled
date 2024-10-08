package X;

/* renamed from: X.GJy  reason: case insensitive filesystem */
public final class C52233GJy extends C270664h6 {
    public C52228GJt A00;
    public boolean A01;
    public final int A02 = 749813689;
    public final 02m A03;
    public final String A04;

    public final void D3r(H3D h3d) {
        0qQ.A0B(h3d, 0);
        if (this.A01) {
            this.A03.markerDrop(this.A02);
            this.A01 = false;
        }
    }

    public final void D3t(C52228GJt gJt) {
        0qQ.A0B(gJt, 0);
        02m r4 = this.A03;
        int i = this.A02;
        r4.markerStart(i);
        r4.markerAnnotate(i, "logger_version", 1);
        r4.markerAnnotate(i, "clips_viewer_source", this.A04);
        r4.markerAnnotate(i, "is_first_page", gJt.A02);
        r4.markerAnnotate(i, "is_streaming", gJt.A04);
        r4.markerAnnotate(i, "is_refreshing", gJt.A03);
        r4.markerAnnotate(i, "prefetch_connect_status", AnonymousClass7TF.A0j(C52234GJz.A00(gJt.A00)));
        this.A01 = true;
        this.A00 = gJt;
    }

    public final void D3u(C52263GLe gLe) {
        0qQ.A0B(gLe, 0);
        if (this.A01) {
            02m r5 = this.A03;
            int i = this.A02;
            r5.markerAnnotate(i, "is_cached_response", gLe.A01.CPt());
            r5.markerAnnotate(i, "reels_page_index", gLe.A05);
            int i2 = gLe.A00;
            r5.markerAnnotate(i, 002.A0O("chunk_size_", i2), gLe.A09.size());
            r5.markerPoint(i, 002.A0O("point_response_chunk_", i2));
        }
        C52228GJt gJt = this.A00;
        if (gJt != null && !gJt.A04 && this.A01) {
            this.A03.markerEnd(this.A02, 2);
            this.A01 = false;
        }
    }

    public final void D3s() {
        C52228GJt gJt = this.A00;
        if (gJt != null && gJt.A04 && this.A01) {
            this.A03.markerEnd(this.A02, 2);
            this.A01 = false;
        }
    }

    public C52233GJy(02m r2, String str) {
        this.A03 = r2;
        this.A04 = str;
    }
}
