package com.instagram.clips.audio.trending.repository;

import X.AnonymousClass7TG;
import X.C55603HkO;
import androidx.paging.PagingSource;
import com.instagram.common.session.UserSession;

public final class TrendingAudioPagingSource extends PagingSource {
    public boolean A00;
    public final int A01;
    public final C55603HkO A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;

    public TrendingAudioPagingSource(C55603HkO hkO, UserSession userSession, String str, String str2, int i) {
        AnonymousClass7TG.A1O(userSession, hkO);
        this.A03 = userSession;
        this.A02 = hkO;
        this.A05 = str;
        this.A04 = str2;
        this.A01 = i;
    }
}
