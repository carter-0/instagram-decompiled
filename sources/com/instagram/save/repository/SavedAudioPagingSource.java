package com.instagram.save.repository;

import X.AnonymousClass7TG;
import X.C64027LJo;
import androidx.paging.PagingSource;
import com.instagram.common.session.UserSession;

public final class SavedAudioPagingSource extends PagingSource {
    public final UserSession A00;
    public final String A01;
    public final C64027LJo A02;

    public SavedAudioPagingSource(UserSession userSession, C64027LJo lJo, String str) {
        AnonymousClass7TG.A1O(userSession, lJo);
        this.A00 = userSession;
        this.A02 = lJo;
        this.A01 = str;
    }
}
