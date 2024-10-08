package X;

/* renamed from: X.4kL  reason: invalid class name and case insensitive filesystem */
public enum C272224kL {
    APP_MANAGER_DISABLED(false),
    INSTALLER_DISABLED(false),
    APP_MANAGER_NOT_INSTALLED(true),
    INSTALLER_NOT_INSTALLED(true),
    APP_MANAGER_BAD_SIGNATURE(true),
    INSTALLER_BAD_SIGNATURE(true),
    INSTALLER_NO_PRIVILEGES(true),
    INSTALLER_MISSING_PRIVILEGE(true),
    INSTALLER_INVALID_PRIVILEGE(true),
    INCOMPATIBLE(true),
    UNRECOGNIZED_CONFIGURATION(true),
    FACEBOOK_SERVICES_NO_PERMISSION(true),
    FACEBOOK_SERVICES_NO_DOZE_MODE_WHITELIST(true);
    
    public final boolean A00;

    /* access modifiers changed from: public */
    C272224kL(boolean z) {
        this.A00 = z;
    }
}
