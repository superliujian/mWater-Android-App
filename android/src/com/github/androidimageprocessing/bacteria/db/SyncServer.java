package com.github.androidimageprocessing.bacteria.db;

public interface SyncServer {
	/**
	 * Downloads changes
	 * @param dataSlice slice to download changes for
	 * @param since point after which to download changes
	 * @return changes or null if none
	 */
	ChangeSet downloadChangeSet(DataSlice dataSlice, String since) throws SyncServerException;
	
	/**
	 * Uploads change set
	 */
	void uploadChangeSet(ChangeSet changeSet) throws SyncServerException;
	
	/**
	 * Attempts to cancel upload or download
	 */
	void cancel();
}
