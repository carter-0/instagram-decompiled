package com.instagram.clips.audio.soundsync.repository;

import android.util.LruCache;
import com.instagram.common.session.UserSession;

public final class ClipsSoundSyncBeatsInfoRepository {
    public final LruCache A00 = new LruCache(10);
    public final UserSession A01;

    public ClipsSoundSyncBeatsInfoRepository(UserSession userSession) {
        this.A01 = userSession;
    }
}
