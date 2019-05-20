
		service CustomMap {
			bool ping(),
			void put(1: string key, 2:string val)
			string get(1: string key)
		}
		gen java CustomMap.thrift