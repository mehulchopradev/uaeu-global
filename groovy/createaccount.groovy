import xyz.supercoders.bank.Account

// def a1 = new Account('mehul chopra', 'savings', 10000)
def a2 = new Account(name: 'jane', balance: 6000, type: 'savings')

// is same as

// def a2 = new Account([name: 'jane', balance: 6000, type: 'savings'])

// println a1.name
println a2.name
println a2.balance
