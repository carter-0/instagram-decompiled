package com.instagram.realtimeclient;

import com.instagram.common.session.UserSession;

public interface RealtimeClientManager$ObserverProvider {
    RealtimeClientManager$Observer get(UserSession userSession);
}
