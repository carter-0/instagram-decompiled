package com.facebook.proxygen;

public class FizzSettings {
    public final PersistentSSLCacheSettings cacheSettings;
    public int clientTestEnum;
    public final boolean compatMode;
    public String echPolicy;
    public final boolean enableCertCompression;
    public boolean enableDelegatedCredentials;
    public boolean enableECH;
    public final boolean enabled;
    public boolean fizzChloSNIExtFirst;
    public int hostnamePolicyEnum;
    public final int maxPskUses;
    public int paddingModulo;
    public final boolean persistentCacheEnabled;
    public int pqcKexExperimentConfig;
    public String preferredCompressionAlgorithm;
    public final boolean sendEarlyData;
    public final boolean useJavaCrypto;

    public class Builder {
        public PersistentSSLCacheSettings cacheSettings;
        public int clientTestEnum = -1;
        public boolean compatMode = true;
        public String echPolicy;
        public boolean enableCertCompression = false;
        public boolean enableDelegatedCredentials = false;
        public boolean enableECH = false;
        public boolean enabled = false;
        public boolean fizzChloSNIExtFirst = false;
        public int hostnamePolicyEnum;
        public int maxPskUses = 5;
        public int paddingModulo = 0;
        public boolean persistentCacheEnabled = false;
        public int pqcKexExperimentConfig = 0;
        public String preferredCompressionAlgorithm;
        public boolean sendEarlyData = false;
        public boolean useJavaCrypto = false;

        public FizzSettings build() {
            boolean z = this.enabled;
            int i = this.hostnamePolicyEnum;
            boolean z2 = this.persistentCacheEnabled;
            PersistentSSLCacheSettings persistentSSLCacheSettings = this.cacheSettings;
            boolean z3 = this.sendEarlyData;
            boolean z4 = this.compatMode;
            int i2 = this.maxPskUses;
            boolean z5 = this.useJavaCrypto;
            boolean z6 = this.enableCertCompression;
            String str = this.preferredCompressionAlgorithm;
            int i3 = this.clientTestEnum;
            boolean z7 = this.enableDelegatedCredentials;
            int i4 = this.paddingModulo;
            boolean z8 = this.enableECH;
            String str2 = this.echPolicy;
            return new FizzSettings(z, i, z2, persistentSSLCacheSettings, z3, z4, i2, z5, z6, str, i3, z7, i4, z8, str2, this.pqcKexExperimentConfig, this.fizzChloSNIExtFirst);
        }

        public Builder setClientTestEnum(int i) {
            this.clientTestEnum = i;
            return this;
        }

        public Builder setCompatMode(boolean z) {
            this.compatMode = z;
            return this;
        }

        public Builder setECHPolicy(String str) {
            this.echPolicy = str;
            return this;
        }

        public Builder setEnableCertCompression(boolean z) {
            this.enableCertCompression = z;
            return this;
        }

        public Builder setEnableDelegatedCredentials(boolean z) {
            this.enableDelegatedCredentials = z;
            return this;
        }

        public Builder setEnableECH(boolean z) {
            this.enableECH = z;
            return this;
        }

        public Builder setEnabled(boolean z) {
            this.enabled = z;
            return this;
        }

        public Builder setFizzChloSNIExtFirst(boolean z) {
            this.fizzChloSNIExtFirst = z;
            return this;
        }

        public Builder setHostnamePolicy(int i) {
            this.hostnamePolicyEnum = i;
            return this;
        }

        public Builder setMaxPskUses(int i) {
            this.maxPskUses = i;
            return this;
        }

        public Builder setPQCKexExperimentConfig(int i) {
            this.pqcKexExperimentConfig = i;
            return this;
        }

        public Builder setPaddingModulo(int i) {
            this.paddingModulo = i;
            return this;
        }

        public Builder setPersistentCacheEnabled(boolean z) {
            this.persistentCacheEnabled = z;
            return this;
        }

        public Builder setPersistentCacheSettings(PersistentSSLCacheSettings persistentSSLCacheSettings) {
            this.cacheSettings = persistentSSLCacheSettings;
            return this;
        }

        public Builder setPreferredCompressionAlgorithm(String str) {
            this.preferredCompressionAlgorithm = str;
            return this;
        }

        public Builder setSendEarlyData(boolean z) {
            this.sendEarlyData = z;
            return this;
        }

        public Builder setUseJavaCrypto(boolean z) {
            this.useJavaCrypto = z;
            return this;
        }
    }

    public FizzSettings(boolean z, int i, boolean z2, PersistentSSLCacheSettings persistentSSLCacheSettings, boolean z3, boolean z4, int i2, boolean z5, boolean z6, String str, int i3, boolean z7, int i4, boolean z8, String str2, int i5, boolean z9) {
        this.enabled = z;
        this.hostnamePolicyEnum = i;
        this.persistentCacheEnabled = z2;
        this.cacheSettings = persistentSSLCacheSettings;
        this.sendEarlyData = z3;
        this.compatMode = z4;
        this.maxPskUses = i2;
        this.useJavaCrypto = z5;
        this.enableCertCompression = z6;
        this.preferredCompressionAlgorithm = str;
        this.clientTestEnum = i3;
        this.enableDelegatedCredentials = z7;
        this.paddingModulo = i4;
        this.enableECH = z8;
        this.echPolicy = str2;
        this.pqcKexExperimentConfig = i5;
        this.fizzChloSNIExtFirst = z9;
    }
}
