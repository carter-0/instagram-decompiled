package X;

import com.facebook.video.cache.igdatasource.IgHttpDataSource;

/* renamed from: X.47R  reason: invalid class name */
public final class AnonymousClass47R implements AnonymousClass47S {
    public final /* synthetic */ IgHttpDataSource A00;
    public final /* synthetic */ 1QU A01;

    public AnonymousClass47R(IgHttpDataSource igHttpDataSource, 1QU r2) {
        this.A00 = igHttpDataSource;
        this.A01 = r2;
    }

    public final void DJZ(AnonymousClass47X r4) {
        C241943Rz r2;
        IgHttpDataSource igHttpDataSource = this.A00;
        if (!igHttpDataSource.playerSetting.A1a && (r2 = igHttpDataSource.videoRequestPendingStore) != null) {
            String str = igHttpDataSource.videoMetaData.A07;
            0qQ.A07(str);
            r2.EEV(r4, this.A01, str);
        }
    }

    public final void Deh(AnonymousClass47X r4) {
        C241943Rz r2;
        IgHttpDataSource igHttpDataSource = this.A00;
        synchronized (igHttpDataSource) {
            igHttpDataSource.requestToken = r4;
        }
        if (!igHttpDataSource.playerSetting.A1a && (r2 = igHttpDataSource.videoRequestPendingStore) != null) {
            String str = igHttpDataSource.videoMetaData.A07;
            0qQ.A07(str);
            r2.AA2(r4, this.A01, str);
        }
    }
}
